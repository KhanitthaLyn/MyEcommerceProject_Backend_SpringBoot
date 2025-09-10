package com.ecommerce.myecommerceproject.repositories;

import com.ecommerce.myecommerceproject.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
