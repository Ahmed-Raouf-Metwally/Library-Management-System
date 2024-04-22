package com.maid.cc.Library.Management.System.Book.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "book")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer id;

    @Column(name = "book_title")
    @NotNull(message = "Title shouldn't be empty")
    private String title;

    @Column(name = "book_author")
    private String author;

    @Column(name = "book_publication_year")
    private Integer publication_year ;

    @Column(name = "book_isbn")
    private Integer isbn;

    @Column(name = "book_publisher")
    private String publisher;
}
