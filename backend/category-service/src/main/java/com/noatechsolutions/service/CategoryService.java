package com.noatechsolutions.service;

import com.noatechsolutions.dto.SalonDTO;
import com.noatechsolutions.modal.Category;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface CategoryService {

    Category saveCategory(Category category, SalonDTO salonDTO);
    Set<Category> getAllCategoriesBySalon(Long id);
    Category getCategoryById(Long id) throws Exception;
    void deleteCategoryById(Long id, Long salonId) throws Exception;
}
