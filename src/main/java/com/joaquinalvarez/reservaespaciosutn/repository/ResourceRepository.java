package com.joaquinalvarez.reservaespaciosutn.repository;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
