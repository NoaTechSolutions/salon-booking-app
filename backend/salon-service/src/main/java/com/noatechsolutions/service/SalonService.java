package com.noatechsolutions.service;

import com.noatechsolutions.modal.Salon;
import com.noatechsolutions.payload.dto.SalonDTO;
import com.noatechsolutions.payload.dto.UserDTO;

import java.util.List;

public interface SalonService {

    Salon createSalon(SalonDTO salon, UserDTO user);
    Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) throws Exception;
    List<Salon> getAllSalons();
    Salon getSalonById(Long salonId) throws Exception;
    Salon getSalonByOwnerId(Long ownerId);
    List<Salon> searchSalonByCity(String city);


}
