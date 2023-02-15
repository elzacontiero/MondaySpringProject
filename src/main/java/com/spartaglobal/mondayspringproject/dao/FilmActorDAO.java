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
// DEAD CODE DO WE NEED?
//    public FilmActorDAO getFilmIdDTOByActorId(Integer id) {
//        List<FilmActor> filmActorList = repo.findFilmIdByActorId(id);
//        if(filmActorList.isEmpty()) {
//            throw new RuntimeException("No actor of that name");
//        }
//        return DTOConverter.filmIdDTO(filmActorList);
//    }
}
