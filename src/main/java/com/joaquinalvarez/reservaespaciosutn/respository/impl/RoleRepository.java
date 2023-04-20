package com.joaquinalvarez.reservaespaciosutn.respository.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.respository.Repository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Repository
public class RoleRepository implements Repository<Role> {

    @Autowired
    private EntityManager em;

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Role add(Role role) {
        em.persist(role);
        return role;
    }

    @Override
    public Role update(Role role) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
