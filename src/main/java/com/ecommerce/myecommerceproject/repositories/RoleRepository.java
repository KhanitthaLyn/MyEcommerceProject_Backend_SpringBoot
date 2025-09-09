package com.ecommerce.myecommerceproject.repositories;

import com.ecommerce.myecommerceproject.model.AppRole;
import com.ecommerce.myecommerceproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
