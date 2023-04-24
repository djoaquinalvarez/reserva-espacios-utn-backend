package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.User;
import com.joaquinalvarez.reservaespaciosutn.repository.UserRepository;
import com.joaquinalvarez.reservaespaciosutn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }

    @Override
    public void update(Long userId, User user) {

    }

    @Override
    public void delete(Long userId) {

    }
}
