package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.User;
import com.joaquinalvarez.reservaespaciosutn.model.view.CreateUserDto;
import com.joaquinalvarez.reservaespaciosutn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //private EntityManager entman;
    @Autowired
    UserRepository repositoryUser; //no me salio usar el autowired

    public List<User> getUsers(){
        return repositoryUser.findAll();
    }
}
