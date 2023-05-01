package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation getById(Long id);
    List<Reservation> getAll();
    Reservation save(Reservation reservation);
    Reservation update(Long id, Reservation reservation);
    void delete(Long id);
}
