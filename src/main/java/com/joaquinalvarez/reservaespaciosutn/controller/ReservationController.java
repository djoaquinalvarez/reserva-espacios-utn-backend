package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Reservation;
import com.joaquinalvarez.reservaespaciosutn.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/get")
    public ResponseEntity<List<Reservation>> getReservations(){
        return new ResponseEntity<>(reservationService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation){
        return new ResponseEntity<>(reservationService.save(reservation), HttpStatus.CREATED);
    }

    
}
