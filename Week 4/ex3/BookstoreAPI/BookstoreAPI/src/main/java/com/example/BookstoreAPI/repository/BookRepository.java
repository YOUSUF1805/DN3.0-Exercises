package com.example.BookstoreAPI.repository;

//package com.example.bookstoreapi.repository;

import com.example.BookstoreAPI.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Custom query methods based on method naming conventions

    // Find books by title (case-insensitive)
    List<Book> findByTitleContainingIgnoreCase(String title);

    // Find books by author (case-insensitive)
    List<Book> findByAuthorContainingIgnoreCase(String author);

    // Find books by both title and author (case-insensitive)
    List<Book> findByTitleContainingIgnoreCaseAndAuthorContainingIgnoreCase(String title, String author);
}
