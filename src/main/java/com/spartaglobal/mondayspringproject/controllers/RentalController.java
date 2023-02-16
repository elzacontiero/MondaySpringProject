package com.spartaglobal.mondayspringproject.controllers;

import com.spartaglobal.mondayspringproject.entities.Rental;
import com.spartaglobal.mondayspringproject.repositories.RentalRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RentalController {

    @Autowired
    private RentalRepository rentRepo;


    @GetMapping("springProject/api/getRental/{id}")
    public Rental getRentals(@PathVariable int id){
        Optional<Rental> rent = rentRepo.findById(id);
        Rental rental = rent.get();
        return rental;
    }
}
