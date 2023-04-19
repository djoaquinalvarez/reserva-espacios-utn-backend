package com.joaquinalvarez.reservaespaciosutn.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
