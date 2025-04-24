package com.noatechsolutions.payload.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
@Getter
@Setter
public class SalonDTO {

    private Long id;
    private String name;
    private List<String> images;
    private String address;
    private String phoneNumber;
    private String email;
    private String city;
    private Long ownerId;
    private LocalTime openTime;
    private LocalTime closeTime;
    /*private LocalDateTime openTime;
    private LocalDateTime closeTime;*/
}
