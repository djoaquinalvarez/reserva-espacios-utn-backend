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
    public Role getById(Long id) {
        return null;
    }

    @Override
    public Role save(Role createRole) {
        return roleRepository.save(createRole);
    }
    @Override
    public Role update(Long roleId, Role updateRoleDto) {
        Optional<Role> rolEncontrado =
    }
    @Override
    public void delete(Long roleId) {

    }
}
