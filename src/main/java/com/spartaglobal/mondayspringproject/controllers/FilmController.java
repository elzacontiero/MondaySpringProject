package com.spartaglobal.mondayspringproject.controllers;

import com.spartaglobal.mondayspringproject.dao.FilmDAO;
import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    }

    // Ticket 17 - Create a put mapping method with endpoints that can create a new film or update film.

    @Transactional
    @PutMapping("springProject/api/films/putFilm")
    public Film putFilm(@RequestBody Film newFilm) {
        FilmDAO dao = new FilmDAO(repo);
        Optional<Film> oldFilm = dao.findByID(newFilm.getId());
        if (oldFilm.isPresent()) {
            Film film = oldFilm.get();
            if (newFilm.getDescription() != null)  {
                film.setDescription(newFilm.getDescription());
            }
            if (newFilm.getTitle() != null) {
                film.setTitle(newFilm.getTitle());
            }
            if (newFilm.getLength() != null) {
                film.setLength(newFilm.getLength());
            }
            if (newFilm.getRating() != null){
                film.setRating(newFilm.getRating());
            }
            if (newFilm.getReleaseYear() != null){
                film.setReleaseYear(newFilm.getReleaseYear());
            }
            if (newFilm.getRentalDuration() != null){
                film.setRentalDuration(newFilm.getRentalDuration());
            }
            if (newFilm.getReplacementCost() != null){
                film.setReplacementCost(newFilm.getReplacementCost());
            }
            if (newFilm.getSpecialFeatures() != null){
                film.setSpecialFeatures(newFilm.getSpecialFeatures());
            }
            if (newFilm.getRentalRate()!= null){
                film.setRentalRate(newFilm.getRentalRate());
            }

            film.setLastUpdate(Instant.now());
            return dao.update(film);
        } else {
            return repo.save(newFilm);
        }
    }

}
