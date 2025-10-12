package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Cart entity represents a shopping cart for a user in the e-commerce application.
 * It is mapped to the "carts" table in the database.
 */
@Entity
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@Table(name = "carts")
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
public class Cart {

    /**
     * Primary key for the Cart entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    /**
     * One-to-One relationship with User entity.
     * Each user has one cart.
     */
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    /**
     * One-to-Many relationship with CartItem entity.
     * A cart can contain multiple cart items.
     * CascadeType.PERSIST, MERGE, REMOVE ensures that changes in the cart are propagated to its items.
     * orphanRemoval = true ensures that removed items are deleted from the database.
     */
    @OneToMany(mappedBy = "cart", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true)
    private List<CartItem> cartItems = new ArrayList<>();

    /**
     * Total price of all items in the cart.
     * Initialized to 0.0 by default.
     */
    private Double totalPrice = 0.0;
}
