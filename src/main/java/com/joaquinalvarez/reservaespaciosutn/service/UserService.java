package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.User;
import com.joaquinalvarez.reservaespaciosutn.respository.Repository;
import com.joaquinalvarez.reservaespaciosutn.respository.impl.UserRepositoryImpl;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //private EntityManager entman;
    @Autowired
    Repository<User> repositoryUser; //no me salio usar el autowired
    @Autowired
    private EntityManager em;


    public List<User> getUsers(){
        return repositoryUser.findAll();
    }
}
