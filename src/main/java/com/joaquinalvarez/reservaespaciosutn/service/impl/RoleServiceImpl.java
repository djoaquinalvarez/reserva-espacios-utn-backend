package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.repository.RoleRepository;
import com.joaquinalvarez.reservaespaciosutn.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }

    @Override
    public Role getById(Long id) throws Exception {
        Optional<Role> roleFound = getRoles().stream().
                filter(r -> r.getId().equals(id))
                .findFirst();
        return roleFound.orElseThrow(() -> new Exception("El rol no ha sido encontrado en la base de datos"));
    }

    @Override
    public Role save(Role createRole) {
        return roleRepository.save(createRole);
    }
    @Override
    public Role update(Long roleId, Role updateRole) throws Exception {
        Optional<Role> rolEncontrado = getRoles().stream()
                .filter(r -> r.getId().equals(roleId))
                .findFirst();

        Role rolActualizado = rolEncontrado.orElseThrow(() -> new Exception("El rol que se quiere modificar no se encuentra en la base de datos"));
        rolActualizado.setName(updateRole.getName());
        return roleRepository.save(rolActualizado);
    }
    @Override
    public void delete(Long roleId) throws Exception {
        roleRepository.delete(getById(roleId));
    }
}
