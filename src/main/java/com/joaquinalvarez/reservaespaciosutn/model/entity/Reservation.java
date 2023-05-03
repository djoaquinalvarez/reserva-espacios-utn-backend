package com.joaquinalvarez.reservaespaciosutn.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", locale = "es-Arg", timezone = "America/Buenos Aires")
    private Date reservationDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", locale = "es-Arg", timezone = "America/Buenos Aires")
    private Date reservationTime;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User requestingUser;

    @ManyToOne
    @JoinColumn(name="place_id", referencedColumnName = "id")
    private Place requestedPlace;

}
