package com.ecommerce.myecommerceproject.repositories;

import com.ecommerce.myecommerceproject.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
