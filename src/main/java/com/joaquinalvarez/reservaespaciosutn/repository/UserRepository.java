package com.joaquinalvarez.reservaespaciosutn.repository;

import com.joaquinalvarez.reservaespaciosutn.model.entity.User;
import com.joaquinalvarez.reservaespaciosutn.model.view.CreateUserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
