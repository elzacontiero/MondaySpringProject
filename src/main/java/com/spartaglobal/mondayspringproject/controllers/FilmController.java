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

    @PostMapping("springProject/api/films/postFilm")
    public Film postFilm(@RequestBody Film newFilm) {
        Film addFilm = new Film();
        addFilm.setId(newFilm.getId());
        addFilm.setTitle(newFilm.getTitle());
        addFilm.setDescription(newFilm.getDescription());
        addFilm.setReleaseYear(newFilm.getReleaseYear());
        addFilm.setRentalDuration(newFilm.getRentalDuration());
        addFilm.setLength(newFilm.getLength());
        addFilm.setReplacementCost(newFilm.getReplacementCost());
        addFilm.setRating(newFilm.getRating());
        addFilm.setSpecialFeatures(newFilm.getSpecialFeatures());
        addFilm.setLastUpdate(Instant.now());

        Film saveFilm = repo.save(addFilm);

        return saveFilm;
//
//        newFilm.setLastUpdate(Instant.now());
//        return repo.save(newFilm);
    }
}
