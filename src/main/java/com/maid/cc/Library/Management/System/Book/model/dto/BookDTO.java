package com.maid.cc.Library.Management.System.Book.model.dto;

import com.maid.cc.Library.Management.System.Book.model.entity.Book;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {


    private Integer id;

    @NotNull(message = "Title shouldn't be empty")
    private String title;

    @NotNull(message = "Author shouldn't be empty")
    private String author;

    private Integer publication_year ;

    @NotNull(message = "ISBN shouldn't be empty")
    private Integer isbn;

    @NotNull(message = "Publisher shouldn't be empty")
    private String publisher;

    public static BookDTO toDTO(Book bookEntity){
        return BookDTO.builder()
                .id(bookEntity.getId())
                .title(bookEntity.getTitle())
                .author(bookEntity.getAuthor())
                .publication_year(bookEntity.getPublication_year())
                .isbn(bookEntity.getIsbn())
                .publisher(bookEntity.getPublisher())
                .build();
    }
}
