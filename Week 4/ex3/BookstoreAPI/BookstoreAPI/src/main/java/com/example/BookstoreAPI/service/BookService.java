package com.example.BookstoreAPI.service;


import com.example.BookstoreAPI.entity.Book;
import com.example.BookstoreAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findBooksByFilters(String title, String author) {
        // Implement filtering logic based on title and author
        // This could be done using query methods or specifications

        return List.of();
    }
}

