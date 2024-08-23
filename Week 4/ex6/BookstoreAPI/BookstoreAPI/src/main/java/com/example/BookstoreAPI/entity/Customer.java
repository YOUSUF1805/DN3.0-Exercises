package com.example.BookstoreAPI.entity;

//package com.example.bookstoreapi.entity;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String address;
}
