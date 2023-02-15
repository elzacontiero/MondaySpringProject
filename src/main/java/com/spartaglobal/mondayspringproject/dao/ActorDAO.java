package com.spartaglobal.mondayspringproject.dao;

import com.spartaglobal.mondayspringproject.dto.ActorDTO;
import com.spartaglobal.mondayspringproject.entities.Actor;
import com.spartaglobal.mondayspringproject.repositories.ActorRepository;
import com.spartaglobal.mondayspringproject.utils.DTOConverter;

import java.util.List;

public class ActorDAO {
    private ActorRepository repo;

    public ActorDAO(ActorRepository repo) {
        this.repo = repo;
    }

    // ed chase (id 3)
    public ActorDTO getActorDTOByName(String firstName, String lastName) {
        List<Actor> actorList = repo.findActorByFirstNameAndLastName(firstName, lastName);
        if(actorList.isEmpty()) {
            throw new RuntimeException("No actor of that name");
        }
        return DTOConverter.toDTO(actorList.get(0));
    }
}
