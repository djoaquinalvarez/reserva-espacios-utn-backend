package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation getById(Long id) throws Exception;
    List<Reservation> getAll();
    Reservation save(Reservation reservation);
    Reservation update(Long id, Reservation reservation) throws Exception;
    void delete(Long id) throws Exception;
}
