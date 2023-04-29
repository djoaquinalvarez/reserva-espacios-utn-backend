package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.User;
import com.joaquinalvarez.reservaespaciosutn.repository.UserRepository;
import com.joaquinalvarez.reservaespaciosutn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    //private EntityManager entman;
    @Autowired
    UserRepository repositoryUser; //no me salio usar el autowired


    public List<User> getUsers(){
        return repositoryUser.findAll();
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User save(User createUser) {
        return repositoryUser.save(createUser);
    }

    @Override
    public User update(Long userId, User user) throws Exception {
        Optional<User> usuarioEncontrado = getUsers().stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst();

        User usuarioActualizado = usuarioEncontrado.orElseThrow(() -> new Exception("El usuario no ha sido encontrado en la base de datos"));
        usuarioActualizado.setName(user.getName());
        usuarioActualizado.setRole(user.getRole());
        return repositoryUser.save(usuarioActualizado);
    }

    @Override
    public void delete(Long userId) throws Exception {
        Optional<User> usuarioEncontrado = getUsers().stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst();

        User usuarioEliminado = usuarioEncontrado.orElseThrow(() -> new Exception("El usuario no ha sido encontrado en la base de datos"));
        repositoryUser.delete(usuarioEliminado);
    }
}
