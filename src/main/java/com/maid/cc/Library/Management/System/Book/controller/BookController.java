package com.maid.cc.Library.Management.System.Book.controller;

import com.maid.cc.Library.Management.System.Book.model.dto.BookDTO;
import com.maid.cc.Library.Management.System.Book.model.entity.Book;
import com.maid.cc.Library.Management.System.Book.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService BookService;

    @GetMapping("/get-all-books")
    public ResponseEntity GetAllBooks() {
        return ResponseEntity.ok(BookService.GetAllBooks());
    }

    @GetMapping("/get-book")
    public ResponseEntity GetBook(@RequestParam("id") int bookID) {
        return ResponseEntity.ok(BookService.GetBook(bookID));
    }

    @PostMapping("/post-book")
    public ResponseEntity postBook(@Valid @RequestBody Book book) {
        return ResponseEntity.ok(BookDTO.toDTO(BookService.AddBook(book)));
    }

    @DeleteMapping("/delete-book")
    public void deleteBook(@RequestParam("id") int bookID) {
        BookService.DeleteeBook(bookID);
    }

    @PutMapping("/put-book")
    public ResponseEntity updateBook(@Valid @RequestBody Book book) {
        return ResponseEntity.ok(BookDTO.toDTO(BookService.AddBook(book)));
    }
}
