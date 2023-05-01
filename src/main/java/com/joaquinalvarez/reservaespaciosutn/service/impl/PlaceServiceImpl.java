package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Place;
import com.joaquinalvarez.reservaespaciosutn.repository.PlaceRepository;
import com.joaquinalvarez.reservaespaciosutn.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public Place getById(Long id) {
        return null;
    }

    @Override
    public List<Place> getAll() {
        return placeRepository.findAll();
    }

    @Override
    public Place save(Place place) {
        return null;
    }

    @Override
    public Place update(Place place) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
