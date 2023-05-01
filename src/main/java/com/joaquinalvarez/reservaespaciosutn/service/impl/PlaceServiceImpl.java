package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Place;
import com.joaquinalvarez.reservaespaciosutn.repository.PlaceRepository;
import com.joaquinalvarez.reservaespaciosutn.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return placeRepository.save(place);
    }

    @Override
    public Place update(Long id, Place place) throws Exception {
        Optional<Place> placeFound = getAll().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        Place placeUpdated = placeFound.orElseThrow(() -> new Exception("El lugar que se quiere modificar no se encuentra en la base de datos."));
        placeUpdated.setName(place.getName());

        return placeRepository.save(placeUpdated);
    }

    @Override
    public void delete(Long id) {

    }
}
