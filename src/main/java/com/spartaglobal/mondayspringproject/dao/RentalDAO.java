package com.spartaglobal.mondayspringproject.dao;

import com.spartaglobal.mondayspringproject.dto.RentalDTO;
import com.spartaglobal.mondayspringproject.entities.Rental;
import com.spartaglobal.mondayspringproject.repositories.RentalRepository;
import com.spartaglobal.mondayspringproject.utils.DTOConverter;

import java.util.Optional;

public class RentalDAO {
    private RentalRepository repo;

    public RentalDAO(RentalRepository repo) {
        this.repo = repo;
    }

    public RentalDTO getRentalDTObyId(Integer id){
        Optional<Rental> getRental = repo.findById(id);
        return DTOConverter.toRentalDTO(getRental.get());

    }
}
