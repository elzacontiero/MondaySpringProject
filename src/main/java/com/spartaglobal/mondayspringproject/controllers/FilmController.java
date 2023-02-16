package com.spartaglobal.mondayspringproject.controllers;

import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.Instant;
import java.util.Optional;

@RestController
public class FilmController {
    @Autowired
    private FilmRepository repo;

    @GetMapping("springProject/api/films/{id}")
    public Film getFilm(@PathVariable int id) {
        Optional<Film> result = repo.findById(id);
        Film film = result.get();
        return film;
    }

//    @PostMapping("springProject/api/films/postFilm")
//    public Film postFilm(@RequestBody Film newFilm) {
//        newFilm.setLastUpdate(Instant.now());
//        return repo.save(newFilm);
//    }

    @PatchMapping("springProject/api/films/patchFilm")
    public Film patchFilm(@RequestBody Film contentFilm){
        Film ogFilm = repo.findById(contentFilm.getId()).get();
        if (contentFilm.getTitle() != null){
            ogFilm.setTitle(contentFilm.getTitle());
        }
        if (contentFilm.getDescription() != null){
            ogFilm.setDescription(contentFilm.getDescription());
        }
        if (contentFilm.getReleaseYear() != null){
            ogFilm.setReleaseYear(contentFilm.getReleaseYear());
        }
        if (contentFilm.getRentalRate() != null){
            ogFilm.setRentalRate(contentFilm.getRentalRate());
        }
        if (contentFilm.getRentalDuration() != null){
            ogFilm.setRentalDuration(contentFilm.getRentalDuration());
        }
        if (contentFilm.getLength() != null){
            ogFilm.setLength(contentFilm.getLength());
        }
        if (contentFilm.getReplacementCost() != null){
            ogFilm.setReplacementCost(contentFilm.getReplacementCost());
        }
        if (contentFilm.getRating() != null){
            ogFilm.setRating(contentFilm.getRating());
        }
        if (contentFilm.getSpecialFeatures() != null){
            ogFilm.setSpecialFeatures(contentFilm.getSpecialFeatures());
        }
        ogFilm.setLastUpdate(Instant.now());
        return repo.save(ogFilm);
    }
    @ExceptionHandler
    public String reportError(Throwable t){

        return "<h1>Error! You messed up!";
    }
}
