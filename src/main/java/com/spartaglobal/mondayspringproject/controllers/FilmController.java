package com.spartaglobal.mondayspringproject.controllers;

import com.spartaglobal.mondayspringproject.dao.FilmDAO;
import com.spartaglobal.mondayspringproject.dao.LanguageDAO;
import com.spartaglobal.mondayspringproject.dto.FilmDTO;
import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.repositories.FilmRepository;
import com.spartaglobal.mondayspringproject.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import java.time.Instant;
import java.util.Optional;

@RestController
@Transactional
public class FilmController {
    @Autowired
    private FilmRepository filmRepo;

    @Autowired
    private LanguageRepository langRepo;

    @GetMapping("springProject/api/films/{id}")
    public Film getFilm(@PathVariable int id) {
        Optional<Film> result = filmRepo.findById(id);
        Film film = result.get();
        return film;
    }


    @PostMapping("springProject/api/films/postFilm")
    public Film postFilm(@RequestBody FilmDTO jsonBody) {
        Film newFilm = new FilmDAO(filmRepo).getNewFilm(jsonBody);
        newFilm.setLanguage(new LanguageDAO(langRepo).getLanguage(jsonBody));
        return filmRepo.save(newFilm);

    }



    @PatchMapping("springProject/api/films/patchFilm")
    public Film patchFilm(@RequestBody Film contentFilm){
        Film ogFilm = filmRepo.findById(contentFilm.getId()).get();
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
        return filmRepo.save(ogFilm);
    }


    @DeleteMapping("springProject/api/films/{id}")
    public void deleteFilms(@PathVariable int id){
        filmRepo.deleteById(id);
    }

    @ExceptionHandler
    public String reportError(Throwable t){

        return "<h1>Error! You messed up!";
    }
}
