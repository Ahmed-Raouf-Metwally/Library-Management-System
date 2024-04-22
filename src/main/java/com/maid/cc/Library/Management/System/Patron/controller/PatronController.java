package com.maid.cc.Library.Management.System.Patron.controller;

import com.maid.cc.Library.Management.System.Book.model.dto.BookDTO;
import com.maid.cc.Library.Management.System.Book.model.entity.Book;
import com.maid.cc.Library.Management.System.Patron.model.dto.PatronDTO;
import com.maid.cc.Library.Management.System.Patron.model.entity.Patron;
import com.maid.cc.Library.Management.System.Patron.service.PatronService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PatronController {

    @Autowired
    private PatronService patronService;

    @GetMapping("/get-all-patrons")
    public ResponseEntity GetAllpatrons() {
        return ResponseEntity.ok(patronService.GetAllPatrons());
    }

    @GetMapping("/get-patron")
    public ResponseEntity GetBook(@RequestParam("id") int patronID) {
        return ResponseEntity.ok(patronService.GetPatron(patronID));
    }

    @PostMapping("/post-patron")
    public ResponseEntity postPatron(@Valid @RequestBody Patron patron) {
        return ResponseEntity.ok(PatronDTO.toDTO(patronService.AddPatron(patron)));
    }

    @DeleteMapping("/delete-patron")
    public void deletePatron(@RequestParam("id") int patronID) {
        patronService.DeleteePatron(patronID);
    }

    @PutMapping("/put-patron")
    public ResponseEntity updatePatron(@Valid @RequestBody Patron patron) {
        return ResponseEntity.ok(patronService.AddPatron(patron));
    }
}
