package com.joaquinalvarez.reservaespaciosutn.service.impl;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Reservation;
import com.joaquinalvarez.reservaespaciosutn.repository.ReservationRepository;
import com.joaquinalvarez.reservaespaciosutn.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation getById(Long id) throws Exception {
        Optional<Reservation> reservationFound = getAll().stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();

        return reservationFound.orElseThrow(() -> new Exception("La reserva no ha sido encontrada en la base de datos."));
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Long id, Reservation reservation) throws Exception {
        Reservation reservationToUpdate = getById(id);
        reservationToUpdate.setReservationDate(reservation.getReservationDate());
        reservationToUpdate.setReservationTime(reservation.getReservationTime());
        reservationToUpdate.setRequestedPlace(reservation.getRequestedPlace());
        reservationToUpdate.setRequestingUser(reservation.getRequestingUser());
        return reservationRepository.save(reservationToUpdate);
    }

    @Override
    public void delete(Long id) {

    }
}
