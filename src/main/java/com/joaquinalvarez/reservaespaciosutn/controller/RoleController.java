package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.view.CreateRoleDto;
import com.joaquinalvarez.reservaespaciosutn.service.RoleService;
import com.joaquinalvarez.reservaespaciosutn.service.impl.RoleServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/get")
    public ResponseEntity<List<Role>> getRoles(){
        return new ResponseEntity<>(roleService.getRoles(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Role> createRole(@RequestBody Role role){
        return new ResponseEntity<>(roleService.save(role), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Role> updateRole(@RequestBody Role role, @PathVariable Long id) throws Exception {
        return new ResponseEntity<>(roleService.update(id, role), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRole(@PathVariable Long id) throws Exception {
        roleService.delete(id);
    }
}
