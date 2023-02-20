package com.spartaglobal.mondayspringproject.dao;

import com.spartaglobal.mondayspringproject.dto.FilmDTO;
import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.entities.FilmActor;
import com.spartaglobal.mondayspringproject.repositories.FilmRepository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilmDAO {
    private FilmRepository repo;

    public FilmDAO(FilmRepository repo){
        this.repo = repo;
    }

    public List<String > getFilmTitle(List<FilmActor> filmActors){ //1 2 3 4 5
        List<String> listTitleFilm = new ArrayList<>();
        for(FilmActor f : filmActors){
            String title = f.getFilm().getTitle();

            listTitleFilm.add(title);
        }
        return listTitleFilm;
    }

    public Film getNewFilm(FilmDTO jsonBody) {
        Film newFilm = new Film();
        newFilm.setId(0);
        newFilm.setTitle(jsonBody.getTitle());
        newFilm.setDescription(jsonBody.getDescription());
        newFilm.setReleaseYear(jsonBody.getReleaseYear());
        newFilm.setRentalDuration(jsonBody.getRentalDuration());
        newFilm.setRentalRate(jsonBody.getRentalRate());
        newFilm.setLength(jsonBody.getLength());
        newFilm.setReplacementCost(jsonBody.getReplacementCost());
        newFilm.setRating(jsonBody.getRating());
        newFilm.setSpecialFeatures(jsonBody.getSpecialFeatures());
        newFilm.setLastUpdate(Instant.now());
        return newFilm;
    }
}
