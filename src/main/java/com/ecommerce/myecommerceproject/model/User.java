package com.ecommerce.myecommerceproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User entity represents a user of the e-commerce application.
 * It is mapped to the "users" table in the database.
 */
@Entity
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class User {

    /**
     * Primary key for the User entity.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    /**
     * Username of the user.
     * Cannot be blank and maximum length is 20 characters.
     * Must be unique in the database.
     */
    @NotBlank
    @Size(max = 20)
    @Column(name = "username")
    private String username;

    /**
     * Email of the user.
     * Cannot be blank, must be a valid email, and maximum length is 50 characters.
     * Must be unique in the database.
     */
    @NotBlank
    @Size(max = 50)
    @Email
    @Column(name = "email")
    private String email;

    /**
     * Password of the user.
     * Cannot be blank and maximum length is 120 characters.
     */
    @NotBlank
    @Size(max = 120)
    @Column(name = "password")
    private String password;

    /**
     * Custom constructor with username, email, and password.
     */
    public User(String userName, String email, String password) {
        this.username = userName;
        this.email = email;
        this.password = password;
    }

    /**
     * Many-to-Many relationship with Role entity.
     * A user can have multiple roles, and a role can belong to multiple users.
     * CascadeType.PERSIST and MERGE propagate changes.
     * FetchType.EAGER loads all roles immediately.
     */
    @Setter
    @Getter
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    /**
     * One-to-Many relationship with Address entity.
     * A user can have multiple addresses.
     * CascadeType.PERSIST and MERGE propagate changes, orphanRemoval deletes removed addresses.
     */
    @Getter
    @Setter
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();

    /**
     * One-to-One relationship with Cart entity.
     * Each user has one shopping cart.
     * Excluded from toString to prevent potential recursion issues.
     */
    @ToString.Exclude
    @OneToOne(mappedBy = "user", cascade = { CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Cart cart;

    /**
     * One-to-Many relationship with Product entity.
     * A user can be a seller and have multiple products.
     * Excluded from toString to prevent potential recursion issues.
     */
    @ToString.Exclude
    @OneToMany(mappedBy = "user",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            orphanRemoval = true)
    private Set<Product> products = new HashSet<>();
}
