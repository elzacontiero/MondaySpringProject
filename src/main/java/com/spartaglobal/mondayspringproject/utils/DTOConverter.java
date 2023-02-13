package com.spartaglobal.mondayspringproject.utils;

import com.spartaglobal.mondayspringproject.dto.ActorDTO;
import com.spartaglobal.mondayspringproject.entities.Actor;

public class DTOConverter {
    public static ActorDTO toDTO(Actor actor) {
        ActorDTO actorDto = new ActorDTO();
        actorDto.setFirstName(actor.getFirstName());
        actorDto.setLastName(actor.getLastName());
        return actorDto;
    }
}
