package com.spartaglobal.mondayspringproject;

import com.spartaglobal.mondayspringproject.dao.ActorDAO;
import com.spartaglobal.mondayspringproject.repositories.ActorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
public class ActorTest {

    @Autowired
    ActorRepository repo;

    @Test
    public void testGetActorFirstAndLastName() {
        var result = new ActorDAO(repo).getActorDTOByName("ZERO","CAGE");
        System.out.println(result);
        Assertions.assertEquals("ZERO", result.getFirstName() );
        Assertions.assertEquals("CAGE", result.getLastName() );
    }
}
