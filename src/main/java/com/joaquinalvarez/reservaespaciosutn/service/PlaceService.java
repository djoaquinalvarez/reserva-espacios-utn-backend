package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Place;

import java.util.List;

public interface PlaceService {

    Place getById(Long id);
    List<Place> getAll();
    Place save(Place place);
    Place update(Long id, Place place) throws Exception;
    void delete(Long id) throws Exception;

}
