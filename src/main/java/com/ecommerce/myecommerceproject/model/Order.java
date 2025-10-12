package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Order entity represents a customer's order in the e-commerce application.
 * It is mapped to the "orders" table in the database.
 */
@Entity
@Table(name = "orders")
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
public class Order {

    /**
     * Primary key for the Order entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    /**
     * Customer's email for this order.
     * Must be a valid email format and cannot be null.
     */
    @Email
    @Column(nullable = false)
    private String email;

    /**
     * One-to-Many relationship with OrderItem entity.
     * An order can contain multiple order items.
     * CascadeType.PERSIST and MERGE propagate changes to the order items.
     */
    @OneToMany(mappedBy = "order", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<OrderItem> orderItems = new ArrayList<>();

    /**
     * Date and time when the order was placed.
     */
    private LocalDateTime orderDate;

    /**
     * One-to-One relationship with Payment entity.
     * Each order is associated with a single payment.
     */
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    /**
     * Total amount of the order.
     */
    private Double totalAmount;

    /**
     * Status of the order (e.g., "Pending", "Shipped", "Completed").
     */
    private String orderStatus;

    /**
     * Many-to-One relationship with Address entity.
     * Each order is associated with a delivery address.
     */
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
