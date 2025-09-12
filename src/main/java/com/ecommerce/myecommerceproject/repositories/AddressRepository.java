package com.ecommerce.myecommerceproject.repositories;

import com.ecommerce.myecommerceproject.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
