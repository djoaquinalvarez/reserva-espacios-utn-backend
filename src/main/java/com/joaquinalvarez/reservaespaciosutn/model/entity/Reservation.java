package com.joaquinalvarez.reservaespaciosutn.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User requestingUser;
    @ManyToOne
    @JoinColumn(name="place_id", referencedColumnName = "id")
    private Place requestedPlace;

    public Reservation() {
    }

    public Reservation(Long id, LocalDate reservationDate, LocalTime reservationTime, User requestingUser, Place requestedPlace) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.requestingUser = requestingUser;
        this.requestedPlace = requestedPlace;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public User getRequestingUser() {
        return requestingUser;
    }

    public void setRequestingUser(User requestingUser) {
        this.requestingUser = requestingUser;
    }

    public Place getRequestedPlace() {
        return requestedPlace;
    }

    public void setRequestedPlace(Place requestedPlace) {
        this.requestedPlace = requestedPlace;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", reservationDate=" + reservationDate +
                ", reservationTime=" + reservationTime +
                ", requestingUser=" + requestingUser +
                ", requestedPlace=" + requestedPlace;
    }
}
