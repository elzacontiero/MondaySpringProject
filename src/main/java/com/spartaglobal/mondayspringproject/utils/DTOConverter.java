package com.spartaglobal.mondayspringproject.utils;

import com.spartaglobal.mondayspringproject.dao.FilmActorDAO;
import com.spartaglobal.mondayspringproject.dto.ActorDTO;
import com.spartaglobal.mondayspringproject.dto.FilmActorDTO;
import com.spartaglobal.mondayspringproject.entities.Actor;
import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.entities.FilmActor;

import java.util.List;

public class DTOConverter {
    public static ActorDTO toDTO(Actor actor) {
        ActorDTO aDto = new ActorDTO();
        aDto.setId(actor.getId());
        aDto.setFirstName(actor.getFirstName());
        aDto.setLastName(actor.getLastName());
        return aDto;
    }




}
