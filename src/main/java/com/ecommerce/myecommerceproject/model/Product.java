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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @NotBlank
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;


    @NotBlank
    @Size(min = 6, message = "Product description must contain at least 6 characters")
    private String productDescription;
    private String image;
    private Integer quantity;
    private Double price;
    private Double discount;
    private Double specialPrice;


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
