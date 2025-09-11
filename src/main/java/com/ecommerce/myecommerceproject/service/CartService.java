package com.ecommerce.myecommerceproject.service;

import com.ecommerce.myecommerceproject.payload.CartDTO;

public interface CartService {
    public CartDTO addProductoCart(Long productId, Integer quantity);
}
