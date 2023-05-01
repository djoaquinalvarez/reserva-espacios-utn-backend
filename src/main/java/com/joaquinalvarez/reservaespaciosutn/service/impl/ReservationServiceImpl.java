package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Reservation;
import com.joaquinalvarez.reservaespaciosutn.repository.ReservationRepository;
import com.joaquinalvarez.reservaespaciosutn.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public Reservation getById(Long id) {
        return null;
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation save(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation update(Long id, Reservation reservation) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
