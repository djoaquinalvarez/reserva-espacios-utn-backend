package com.joaquinalvarez.reservaespaciosutn.repository;


import com.joaquinalvarez.reservaespaciosutn.model.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State,Long> { }
