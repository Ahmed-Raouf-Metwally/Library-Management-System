package com.maid.cc.Library.Management.System.Patron.repository;

import com.maid.cc.Library.Management.System.Patron.model.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepo extends JpaRepository<Patron, Integer> {

}
