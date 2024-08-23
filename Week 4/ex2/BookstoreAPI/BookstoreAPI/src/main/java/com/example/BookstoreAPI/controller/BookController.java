package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    // Methods will be added here
    @GetMapping
    public List<Book> getAllBooks() {
        // Logic to return all books
        return List.of();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        // Logic to return a book by ID
        return null;
    }
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        // Logic to create and return a new book
        return book;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        // Logic to update and return the book
        return bookDetails;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        // Logic to delete the book
        return null;
    }


}
