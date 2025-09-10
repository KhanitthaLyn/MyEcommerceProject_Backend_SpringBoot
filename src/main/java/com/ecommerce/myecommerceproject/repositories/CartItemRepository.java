package com.ecommerce.myecommerceproject.repositories;

import com.ecommerce.myecommerceproject.model.CartIem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartIem, Long> {
}
