package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.entity.User;
import com.joaquinalvarez.reservaespaciosutn.repository.UserRepository;
import com.joaquinalvarez.reservaespaciosutn.service.UserService;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    Role role;
    User user;

    @Mock
    UserRepository userRepository;
    @InjectMocks //todos los mocks declarados se inyectan en esta instancia
    UserServiceImpl userService;


    @BeforeEach
    void setUp(){
        role = new Role(1L, "Estudiante");
        user = new User(1L, "Joaquin Alvarez", role);
        //MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllUsersOk() {
        List<User> users = new ArrayList<>();
        users.add(user);

        when(userRepository.findAll()).thenReturn(users);
        List<User> resultadoReal = userService.getUsers();
        assertEquals(users, resultadoReal); //comparamos las listas
    }

    @Test
    void saveUserOk() {
        Role role = new Role(1L, "Estudiante");
        User user = new User(1L, "Joaquin Alvarez", role);

        when(userRepository.save(any(User.class))).thenReturn(user);
        assertEquals(user, userService.save(user));
        verify(userRepository).save(any(User.class)); //verificamos que el metodo del repository que mockeamos se llama
    }
}