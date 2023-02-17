package com.spartaglobal.mondayspringproject.repositories;

import com.spartaglobal.mondayspringproject.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    List<Actor> findActorByFirstNameAndLastName(String firstName, String lastName);

    List<Actor> findActorById(Integer id);
    List<Actor> findActorIdByFirstNameAndLastName(String firstName, String lastName);
}