package com.spartaglobal.mondayspringproject;

import com.spartaglobal.mondayspringproject.dao.ActorDAO;
import com.spartaglobal.mondayspringproject.repositories.ActorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FilmTests {
    @Autowired
    private ActorRepository repo;

    @Test
    void findFilmByActor(){
       var actor = new ActorDAO(repo).getActorDTOByName("ed", "chase");
       // film dao to parse actor.getId()
        System.out.println(actor);
        assertEquals("ed chase", actor);
    }


    // testing to see if this runs, as I am getting an error
    @Test
    void test(){
        assertTrue(true);
    }




}
