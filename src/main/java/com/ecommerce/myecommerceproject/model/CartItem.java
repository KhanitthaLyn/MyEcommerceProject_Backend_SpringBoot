package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CartItem entity represents an individual item in a shopping cart.
 * It is mapped to the "cart_Items" table in the database.
 */
@Entity
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@Table(name = "cart_Items")
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
public class CartItem {

    /**
     * Primary key for the CartItem entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartIemId; // Note: There is a typo here. Should be "cartItemId"

    /**
     * Many-to-One relationship with Cart entity.
     * Many cart items belong to one cart.
     */
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    /**
     * Many-to-One relationship with Product entity.
     * Many cart items can reference the same product.
     */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    /**
     * Quantity of this product in the cart.
     */
    private Integer quantity;

    /**
     * Discount applied to this cart item.
     */
    private Double discount;

    /**
     * Price of the product at the time it was added to the cart.
     */
    private Double productPrice;
}
