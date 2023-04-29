package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.entity.User;

import java.util.List;

public interface UserService {
    User getById(Long id);
    User save(User createUser);
    User update(Long userId, User user);
    void delete(Long userId);
    List<User> getUsers();
}
