package com.spartaglobal.mondayspringproject.repositories;

import com.spartaglobal.mondayspringproject.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD:src/main/java/com/spartaglobal/mondayspringproject/repositories/ActorRepository.java
import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    List<Actor> findActorByFirstNameAndLastName(String firstName, String lastName);

    List<Actor> findActorById(Integer id);
=======
    List<Actor> findActorsByFirstNameAndLastName(String firstName, String lastName);
    List<Actor> findActorIdByFirstNameAndLastName(String firstName, String lastName);
>>>>>>> Nicole:src/main/java/com/spartaglobal/mondayspringproject/repository/ActorRepository.java
}