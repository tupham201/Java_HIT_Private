package org.example.ENTYTI;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Request {
    private String idUser;
    private String idComputer;
    private String status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
