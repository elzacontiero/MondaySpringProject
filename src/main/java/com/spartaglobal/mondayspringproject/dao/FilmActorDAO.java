package com.spartaglobal.mondayspringproject.dao;

import com.spartaglobal.mondayspringproject.entities.FilmActor;
import com.spartaglobal.mondayspringproject.repositories.FilmActorRepository;
import com.spartaglobal.mondayspringproject.utils.DTOConverter;

import java.util.List;

public class FilmActorDAO {
    private FilmActorRepository repo;

    public FilmActorDAO(FilmActorRepository repo) {
        this.repo = repo;
    }

}
