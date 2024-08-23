package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.entity.Book;
import com.example.BookstoreAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 Created
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204 No Content
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.findById(id);

        if (book != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Custom-Header", "BookStoreAPI");

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
