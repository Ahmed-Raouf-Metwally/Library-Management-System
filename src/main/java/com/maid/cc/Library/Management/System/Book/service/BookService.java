package com.maid.cc.Library.Management.System.Book.service;

import com.maid.cc.Library.Management.System.Book.model.dto.BookDTO;
import com.maid.cc.Library.Management.System.Book.model.entity.Book;
import com.maid.cc.Library.Management.System.Book.repository.BookRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;


    public List<Book> GetAllBooks(){
        return this.bookRepo.findAll();
    }

    public BookDTO GetBook(int id) {
        Optional<Book> book =this.bookRepo.findById(id);
        if(book.isPresent()){
            return BookDTO.toDTO(book.get());
        }
        else {
            return null;
        }
    }

    @Transactional
    public Book AddBook(Book book) {
        return this.bookRepo.save(book);
    }

    public void DeleteeBook(int id) {
        this.bookRepo.deleteById(id);
    }
}
