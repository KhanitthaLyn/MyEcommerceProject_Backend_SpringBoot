package com.ecommerce.myecommerceproject.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemsDTO {
    private Long cartId;
    private CartDTO cart;
    private ProductDTO product;
    private Integer quantity;
    private Double totalPrice;
    private Double discount;
}
