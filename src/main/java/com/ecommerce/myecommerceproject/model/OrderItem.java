package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OrderItem entity represents an individual product in a customer's order.
 * It is mapped to the "order_items" table in the database.
 */
@Entity
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@Table(name = "order_items")
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
@NoArgsConstructor  // Lombok annotation to generate a no-argument constructor
public class OrderItem {

    /**
     * Primary key for the OrderItem entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    /**
     * Many-to-One relationship with Product entity.
     * Each order item references a specific product.
     */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    /**
     * Many-to-One relationship with Order entity.
     * Many order items belong to one order.
     */
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    /**
     * Quantity of this product in the order.
     */
    private Integer quantity;

    /**
     * Discount applied to this order item.
     */
    private double discount;

    /**
     * Price of the product at the time it was ordered.
     */
    private double orderedProductPrice;
}
