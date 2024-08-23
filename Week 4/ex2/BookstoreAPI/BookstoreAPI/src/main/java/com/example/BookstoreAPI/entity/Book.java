package com.example.BookstoreAPI.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;
    private String isbn;
}
