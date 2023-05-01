package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.view.CreateRoleDto;
import com.joaquinalvarez.reservaespaciosutn.model.view.UpdateRolDto;

import java.util.List;

public interface RoleService {

    Role getById(Long id) throws Exception;
    List<Role> getRoles();
    Role save(Role createRole);
    Role update(Long roleId, Role updateRoleDto) throws Exception;
    void delete(Long roleId) throws Exception;

}
