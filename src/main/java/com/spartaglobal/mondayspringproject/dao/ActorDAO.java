package com.spartaglobal.mondayspringproject.dao;

import com.spartaglobal.mondayspringproject.dto.ActorDTO;
import com.spartaglobal.mondayspringproject.entities.Actor;
import com.spartaglobal.mondayspringproject.repository.ActorRepository;
import com.spartaglobal.mondayspringproject.utils.DTOConverter;

import java.util.List;

public class ActorDAO {
    private ActorRepository repo;

    public ActorDAO(ActorRepository repo) {
        this.repo = repo;
    }

    public ActorDTO getActorFistNameAndLastName(String firstName, String lastName) {
        List<Actor> actorList = repo.findActorsByFirstNameAndLastName(firstName, lastName);
        if (actorList.size() != 1) {
            throw new RuntimeException("No unique actor with these name and last name.");
        }
        return DTOConverter.toDTO(actorList.get(0));
    }
}
