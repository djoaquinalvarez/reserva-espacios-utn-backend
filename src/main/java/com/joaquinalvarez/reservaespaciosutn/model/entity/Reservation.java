package com.joaquinalvarez.reservaespaciosutn.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
