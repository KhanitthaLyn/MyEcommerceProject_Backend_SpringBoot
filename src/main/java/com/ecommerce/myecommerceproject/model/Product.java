package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Product entity represents a product available in the e-commerce application.
 * It is mapped to the "products" table in the database.
 */
@Entity
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
@Table(name = "products")
@ToString
public class Product {

    /**
     * Primary key for the Product entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    /**
     * Name of the product.
     * Cannot be blank and must contain at least 3 characters.
     */
    @NotBlank
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;

    /**
     * Description of the product.
     * Cannot be blank and must contain at least 6 characters.
     */
    @NotBlank
    @Size(min = 6, message = "Product description must contain at least 6 characters")
    private String productDescription;

    /**
     * Image URL or path for the product.
     */
    private String image;

    /**
     * Quantity of the product available in stock.
     */
    private Integer quantity;

    /**
     * Base price of the product.
     */
    private Double price;

    /**
     * Discount applied to the product.
     */
    private Double discount;

    /**
     * Special price (e.g., promotional price) of the product.
     */
    private Double specialPrice;

    /**
     * Many-to-One relationship with Category entity.
     * Each product belongs to one category.
     */
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    /**
     * Many-to-One relationship with User entity (seller).
     * Each product is associated with a seller.
     */
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;

    /**
     * One-to-Many relationship with CartItem entity.
     * A product can appear in multiple cart items.
     * CascadeType.PERSIST and MERGE propagate changes.
     * FetchType.EAGER loads all related cart items immediately.
     */
    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<CartItem> products = new ArrayList<>();
}
