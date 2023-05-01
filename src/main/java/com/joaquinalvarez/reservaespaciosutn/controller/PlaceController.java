package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Place;
import com.joaquinalvarez.reservaespaciosutn.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
