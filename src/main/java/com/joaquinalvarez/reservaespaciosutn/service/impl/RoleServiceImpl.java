package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.repository.RoleRepository;
import com.joaquinalvarez.reservaespaciosutn.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;
    @Override
    public Role getById(Long id) {
        return null;
    }

    @Override
    public Role save(Role createRole) {
        return roleRepository.save(createRole);
    }
    @Override
    public void update(Long roleId, Role updateRoleDto) {
    }
    @Override
    public void delete(Long roleId) {

    }
}
