package com.spartaglobal.mondayspringproject;

import com.spartaglobal.mondayspringproject.dao.ActorDAO;
import com.spartaglobal.mondayspringproject.repository.ActorRepository;
import com.spartaglobal.mondayspringproject.entities.Actor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ActorTest {

    @Autowired
    ActorRepository repo;

    @Test
    public void testGetActorFirstAndLastName() {
        var result = new ActorDAO(repo).getActorFistNameAndLastName("ZERO","CAGE");
        System.out.println(result);
        Assertions.assertEquals("ZERO", result.getFirstName() );
        Assertions.assertEquals("CAGE", result.getLastName() );
    }

}
