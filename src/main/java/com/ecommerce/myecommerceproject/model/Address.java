package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Address entity represents a user's address in the e-commerce application.
 * It is mapped to the "addresses" table in the database.
 */
@Entity
@Table(name = "addresses")
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate an all-argument constructor
public class Address {

    /**
     * Primary key for the Address entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    /**
     * Street name of the address.
     * Cannot be blank and must have at least 5 characters.
     */
    @NotBlank
    @Size(min = 5, message = "Street name must be at least 5 characters")
    private String street;

    /**
     * Building name of the address.
     * Cannot be blank and must have at least 5 characters.
     */
    @NotBlank
    @Size(min = 5, message = "Building name must be at least 5 characters")
    private String buildingName;

    /**
     * City name of the address.
     * Cannot be blank and must have at least 4 characters.
     */
    @NotBlank
    @Size(min = 4, message = "City name must be at least 4 characters")
    private String city;

    /**
     * State name of the address.
     * Cannot be blank and must have at least 5 characters.
     */
    @NotBlank
    @Size(min = 5, message = "State name must be at least 5 characters")
    private String state;

    /**
     * Country name of the address.
     * Cannot be blank and must have at least 2 characters.
     */
    @NotBlank
    @Size(min = 2, message = "Country name must be at least 2 characters")
    private String country;

    /**
     * Pincode of the address.
     * Cannot be blank and must have at least 5 characters.
     */
    @NotBlank
    @Size(min = 5, message = "Pincode name must be at least 5 characters")
    private String pincode;

    /**
     * Many-to-One relationship with User entity.
     * Many addresses can belong to one user.
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /**
     * Custom constructor without user field.
     */
    public Address(String street, String buildingName, String city, String state, String country, String pincode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
