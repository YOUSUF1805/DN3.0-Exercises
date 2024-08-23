package com.example.BookstoreAPI.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookDTO {

    private Long id;

    @JsonProperty("book_title")
    private String title;

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double price;

    private String isbn;
}
