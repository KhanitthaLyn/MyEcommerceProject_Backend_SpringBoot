package com.ecommerce.myecommerceproject.repositories;


import com.ecommerce.myecommerceproject.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(@NotBlank @Size(min = 5, message = "Category must contain at least 5 characters") String categoryName);

}
