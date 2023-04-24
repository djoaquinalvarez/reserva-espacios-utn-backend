package com.joaquinalvarez.reservaespaciosutn.model.view;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UpdateRolDto {

    private Long id;
    private String nombre;
}
