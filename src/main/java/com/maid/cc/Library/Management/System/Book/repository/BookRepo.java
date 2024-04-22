package com.maid.cc.Library.Management.System.Book.repository;

import com.maid.cc.Library.Management.System.Book.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
