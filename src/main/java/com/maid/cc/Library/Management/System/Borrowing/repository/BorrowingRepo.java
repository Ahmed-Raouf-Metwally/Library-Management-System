package com.maid.cc.Library.Management.System.Borrowing.repository;

import com.maid.cc.Library.Management.System.Borrowing.model.entity.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowingRepo extends JpaRepository<Borrowing, Integer> {
}
