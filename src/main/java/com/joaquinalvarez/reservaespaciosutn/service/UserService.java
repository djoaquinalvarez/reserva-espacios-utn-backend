package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import com.joaquinalvarez.reservaespaciosutn.model.entity.User;

public interface UserService {
    User getById(Long id);
    User save(User createUser);
    void update(Long userId, User user);
    void delete(Long userId);
}
