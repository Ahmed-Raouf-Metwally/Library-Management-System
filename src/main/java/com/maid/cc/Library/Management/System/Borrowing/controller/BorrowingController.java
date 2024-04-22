package com.maid.cc.Library.Management.System.Borrowing.controller;

import com.maid.cc.Library.Management.System.Borrowing.model.entity.Borrowing;
import com.maid.cc.Library.Management.System.Borrowing.service.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BorrowingController {

    @Autowired
    private BorrowingService borrowingService;

    @PostMapping("/post-borrowing")
    public ResponseEntity postBorrowing(@RequestBody Borrowing borrowing) {
        return ResponseEntity.ok(borrowingService.AddBorrowing(borrowing));
    }

    @PutMapping("/put-borrowing")
    public ResponseEntity updateBorrowing(@RequestBody Borrowing borrowing) {
        return ResponseEntity.ok(borrowingService.AddBorrowing(borrowing));
    }

}
