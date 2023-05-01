package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Place;
import com.joaquinalvarez.reservaespaciosutn.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/get")
    public ResponseEntity<List<Place>> getPlaces(){
        return new ResponseEntity<>(placeService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Place> createPlace(@RequestBody Place place){
        return new ResponseEntity<>(placeService.save(place),HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Place> updatePlace(@RequestBody Place place, @PathVariable Long id) throws Exception {
        return new ResponseEntity<>(placeService.update(id, place), HttpStatus.OK);
    }
}
