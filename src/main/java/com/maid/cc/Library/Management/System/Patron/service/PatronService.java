package com.maid.cc.Library.Management.System.Patron.service;
import com.maid.cc.Library.Management.System.Patron.model.dto.PatronDTO;
import com.maid.cc.Library.Management.System.Patron.model.entity.Patron;
import com.maid.cc.Library.Management.System.Patron.repository.PatronRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatronService {

    @Autowired
    private PatronRepo patronRepo;

    public List<Patron> GetAllPatrons(){
        return this.patronRepo.findAll();
    }

    public PatronDTO GetPatron(int id) {
        Optional<Patron> Patron =this.patronRepo.findById(id);
        if(Patron.isPresent()){
            return PatronDTO.toDTO(Patron.get());
        }
        else {
            return null;
        }
    }

    @Transactional
    public Patron AddPatron(Patron Patron) {
        return this.patronRepo.save(Patron);
    }

    public void DeleteePatron(int id) {
        this.patronRepo.deleteById(id);
    }
}
