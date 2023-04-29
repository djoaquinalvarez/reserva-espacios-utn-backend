package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.view.CreateRoleDto;
import com.joaquinalvarez.reservaespaciosutn.model.view.UpdateRolDto;

public interface RoleService {

    Role getById(Long id);
    Role save(Role createRole);
    Role update(Long roleId, Role updateRoleDto);
    void delete(Long roleId);

}
