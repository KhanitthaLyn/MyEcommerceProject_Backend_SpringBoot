package com.ecommerce.myecommerceproject.model;

/**
 * AppRole enum defines the different roles available in the e-commerce application.
 * These roles can be assigned to users to control their access and permissions.
 */
public enum AppRole {
    ROLE_USER,   // Regular user with basic access (e.g., browsing and purchasing products)
    ROLE_ADMIN,  // Administrator with full access to manage the application
    ROLE_SELLER  // Seller who can add and manage products for sale
}
