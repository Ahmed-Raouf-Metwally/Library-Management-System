package com.maid.cc.Library.Management.System.Borrowing.service;

import com.maid.cc.Library.Management.System.Borrowing.model.dto.BorrowingDTO;
import com.maid.cc.Library.Management.System.Borrowing.model.entity.Borrowing;
import com.maid.cc.Library.Management.System.Borrowing.repository.BorrowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowingService {

    @Autowired
    private BorrowingRepo borrowingRepo;

    public BorrowingDTO AddBorrowing(Borrowing borrowing) {
        return BorrowingDTO.toDTO(borrowingRepo.save(borrowing));
    }

}
