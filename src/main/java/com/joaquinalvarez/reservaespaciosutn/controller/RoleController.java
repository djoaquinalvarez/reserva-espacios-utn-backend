package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.service.RoleService;
import com.joaquinalvarez.reservaespaciosutn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/add")
    public ResponseEntity<Role> addRole(@RequestBody Role role){
        return new ResponseEntity<Role>(roleService.addRole(role), HttpStatus.OK);
    }
}
