package com.spartaglobal.mondayspringproject.controllers;

import com.spartaglobal.mondayspringproject.dto.RentalDTO;
import com.spartaglobal.mondayspringproject.entities.Rental;
import com.spartaglobal.mondayspringproject.repositories.RentalRepository;
import com.spartaglobal.mondayspringproject.utils.DTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
public class RentalController {

    @Autowired
    private RentalRepository rentRepo;


    @PatchMapping("springProject/api/rentals/patchRental")
    public RentalDTO patchRentals(@RequestBody Rental jsonBody){
        Rental original = rentRepo.findById(jsonBody.getId()).get();

        original.setRentalDate(Instant.now());
        original.setReturnDate(Instant.now());
        original.setLastUpdate(Instant.now());

        Rental saved = rentRepo.save(original);

        RentalDTO newer = DTOConverter.toRentDTO(saved);

        return newer;
    }

//    @PutMapping("springProject/api/rentals/putRental")
//    public Rental putRentalMethod(){
//
//    }


    @ExceptionHandler
    public String reportError(Throwable t){

        return "<h1>Error! You messed up!";
    }

}
