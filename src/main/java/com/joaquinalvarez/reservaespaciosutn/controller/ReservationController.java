package com.joaquinalvarez.reservaespaciosutn.controller;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Reservation;
import com.joaquinalvarez.reservaespaciosutn.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    
}
