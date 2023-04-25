package com.joaquinalvarez.reservaespaciosutn.model.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;

    @JoinColumn(name = "role_id", referencedColumnName = "id")
    @ManyToOne
    private Role role;

}
