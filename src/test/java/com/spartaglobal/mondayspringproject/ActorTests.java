package com.spartaglobal.mondayspringproject;

import com.spartaglobal.mondayspringproject.dao.ActorDAO;
import com.spartaglobal.mondayspringproject.dao.FilmActorDAO;
import com.spartaglobal.mondayspringproject.dao.FilmDAO;
import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.repositories.ActorRepository;
import com.spartaglobal.mondayspringproject.repositories.FilmActorRepository;
import com.spartaglobal.mondayspringproject.repositories.FilmRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class ActorTests {
    @Autowired
    private ActorRepository repo;
    @Autowired
    private FilmActorRepository faRepo;
    @Autowired
    private FilmRepository fRepo;

    @Test
    void findActorId(){
       var actor = new ActorDAO(repo).getActorDTOByName("ed", "chase");
       var id = actor.getId();
        System.out.println(id);
        assertEquals(3, id);
    }

    @Test
    void findFilmId(){
        var filmId = faRepo.findAllByActor_Id(3);
        System.out.println(filmId);
    }



    @Test
    void getFilmTitleByActorName(){
        var actor = new ActorDAO(repo).getActorDTOByName("ed", "chase");
        var id = actor.getId();
        var filmActorList = faRepo.findAllByActor_Id(id); // returns all films id by actor id
        var films = new FilmDAO(fRepo).getFilmTitle(filmActorList); // returns all films by film id
        System.out.println(films); // should show film titles
        assertTrue(films.size() == 22);
    }



}
