package com.joaquinalvarez.reservaespaciosutn.repository;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
}
