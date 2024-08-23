package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.entity.Book;
import com.example.BookstoreAPI.service.BookService; // Assuming you have a service class
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Fetch all books with optional filters
    @GetMapping
    public ResponseEntity<List<Book>> getBooksByFilters(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "author", required = false) String author) {

        List<Book> books = bookService.findBooksByFilters(title, author);
        return ResponseEntity.ok(books);
    }

    // Fetch a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        Book book = bookService.findById(id);
        if (book != null) {
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Other methods (POST, PUT, DELETE)...
}
