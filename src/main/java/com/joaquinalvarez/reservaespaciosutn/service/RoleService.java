package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.entity.User;
import com.joaquinalvarez.reservaespaciosutn.respository.Repository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService{

    //private EntityManager entman;
    @Autowired
    Repository<Role> roleRepository; //no me salio usar el autowired
    @Autowired
    private EntityManager em;

    public Role addRole(Role role){
        try{
            em.getTransaction().begin();
            roleRepository.add(role);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return role;
    }
}
