package com.joaquinalvarez.reservaespaciosutn.repository;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
