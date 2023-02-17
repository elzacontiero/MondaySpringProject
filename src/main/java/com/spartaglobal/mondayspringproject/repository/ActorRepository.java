package com.spartaglobal.mondayspringproject.repository;

import com.spartaglobal.mondayspringproject.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    List<Actor> findActorsByFirstNameAndLastName(String firstName, String lastName);
    List<Actor> findActorIdByFirstNameAndLastName(String firstName, String lastName);
}