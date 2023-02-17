package com.spartaglobal.mondayspringproject.repositories;

import com.spartaglobal.mondayspringproject.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
    List<Rental> findRentalById(Integer id);
}