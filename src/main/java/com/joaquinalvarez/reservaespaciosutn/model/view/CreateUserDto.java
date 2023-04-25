package com.joaquinalvarez.reservaespaciosutn.model.view;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Role;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CreateUserDto {
    private Long id;
    private String name;
    private Role role;

}
