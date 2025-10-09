package com.ecommerce.myecommerceproject.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long productId;

    @NotBlank(message = "Product name must not be blank")
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;

    private String image;

    @Column(name = "product_description")
    @NotBlank(message = "Product description must not be blank")
    @Size(min = 6, message = "Product description must contain at least 6 characters")
    private String productDescription;

    private Integer quantity;
    private Double price;
    private Double discount;
    private Double specialPrice;
}

