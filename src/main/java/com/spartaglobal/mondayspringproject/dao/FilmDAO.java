package com.spartaglobal.mondayspringproject.dao;

import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.entities.FilmActor;
import com.spartaglobal.mondayspringproject.repositories.FilmRepository;

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

    public Optional<Film> findByID(Integer id) {
        return repo.findById(id);
    }

    public Film update(Film film) {
        return repo.save(film);
    }
}
