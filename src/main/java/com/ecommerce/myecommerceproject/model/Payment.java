package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Payment entity represents a payment record in the e-commerce application.
 * It is mapped to the "payments" table in the database.
 */
@Entity
@Table(name = "payments")
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
public class Payment {

    /**
     * Primary key for the Payment entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    /**
     * One-to-One relationship with Order entity.
     * Each payment is associated with one order.
     * CascadeType.PERSIST and MERGE propagate changes between payment and order.
     */
    @OneToOne(mappedBy = "payment", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Order order;

    /**
     * Payment method (e.g., "Credit Card", "PayPal").
     * Cannot be blank and must have at least 4 characters.
     */
    @NotBlank
    @Size(min = 4, message = "Payment method must contain at least 4 characters")
    private String paymentMethod;

    /**
     * Payment gateway transaction ID.
     */
    private String pgPaymentId;

    /**
     * Payment gateway status (e.g., "SUCCESS", "FAILED").
     */
    private String pgStatus;

    /**
     * Payment gateway response message, if any.
     */
    private String pgResponseMessage;

    /**
     * Name of the payment gateway provider.
     */
    private String pgName;

    /**
     * Custom constructor without order field.
     */
    public Payment(String paymentMethod, String pgPaymentId, String pgStatus,
                   String pgResponseMessage, String pgName) {
        this.paymentMethod = paymentMethod;
        this.pgPaymentId = pgPaymentId;
        this.pgStatus = pgStatus;
        this.pgResponseMessage = pgResponseMessage;
        this.pgName = pgName;
    }
}
