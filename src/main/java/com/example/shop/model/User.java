package com.example.shop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String province;
    private String city;
    private String street;
    private String postalCode;

    public String getUsername() {
        return username;
    }

    public User() {}
}
