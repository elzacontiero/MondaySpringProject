package com.spartaglobal.mondayspringproject.controllers;
import com.spartaglobal.mondayspringproject.dao.RentalDAO;
import com.spartaglobal.mondayspringproject.dto.RentalDTO;
import com.spartaglobal.mondayspringproject.entities.Rental;
import com.spartaglobal.mondayspringproject.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Optional;

@RestController
public class RentalController {
    @Autowired
    private RentalRepository repo;

    //Ticket 20 - Create a get mapping method with endpoints for rental table
    @GetMapping("springProject/api/rental/{id}")
    public RentalDTO getRental(@PathVariable int id) {
        var result = new RentalDAO(repo).getRentalDTObyId(id);
        return result;
    }

//    // Ticket 19 - Create a post mapping method with endpoints for adding data to the rental table
//    @PostMapping("springProject/api/rental")
//    public Rental createRental(@RequestBody Rental newRental) {
//        newRental.setLastUpdate(Instant.now());
//        return repo.save(newRental);
//    }


}
