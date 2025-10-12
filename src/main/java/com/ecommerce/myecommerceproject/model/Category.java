package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Category entity represents a product category in the e-commerce application.
 * It is mapped to the "categories" table in the database.
 */
@Entity(name = "categories")
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
public class Category {

    /**
     * Primary key for the Category entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    /**
     * Name of the category.
     * Cannot be blank and must have at least 5 characters.
     */
    @NotBlank
    @Size(min = 5, message = "Category must contain at least 5 characters")
    private String categoryName;

    /**
     * One-to-many relationship with Product entity.
     * A category can have multiple products.
     * CascadeType.ALL ensures that changes in the category (like delete) cascade to its products.
     */
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;
}