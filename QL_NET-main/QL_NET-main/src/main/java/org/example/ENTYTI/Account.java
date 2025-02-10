package org.example.ENTYTI;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Account {
    private String phone;
    private String password;
    private String idUser;
    private Role role;

}
