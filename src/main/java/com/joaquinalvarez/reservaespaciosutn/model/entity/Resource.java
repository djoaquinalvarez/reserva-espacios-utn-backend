package com.joaquinalvarez.reservaespaciosutn.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor
@Data
@Table(name = "resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private boolean isAvailable;

    private String description;


}
