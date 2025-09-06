package com.ecommerce.myecommerceproject.model;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NotBlank
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;
    @NotBlank
    @Size(min = 6, message = "Product name must contain at least 3 characters")
    private String productDescription;
    private String image;
    private Integer quantity;
    private Double price;
    private Double discount;
    private Double specialPrice;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
