package com.ecommerce.myecommerceproject.repositories;

import com.ecommerce.myecommerceproject.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
