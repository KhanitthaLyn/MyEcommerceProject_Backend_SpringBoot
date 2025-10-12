package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Role entity represents a user role in the e-commerce application.
 * It is mapped to the "roles" table in the database.
 */
@Entity
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@Table(name = "roles")
public class Role {

    /**
     * Primary key for the Role entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * Name of the role, stored as an enum string (AppRole).
     * Length is limited to 20 characters in the database.
     * Excluded from toString to prevent potential recursion issues.
     */
    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    @Column(length = 20, name = "role_name")
    private AppRole roleName;

    /**
     * Custom constructor with only roleName.
     */
    public Role(AppRole roleName) {
        this.roleName = roleName;
    }
}
