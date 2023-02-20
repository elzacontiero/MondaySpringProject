package com.spartaglobal.mondayspringproject.utils;

import com.spartaglobal.mondayspringproject.dto.ActorDTO;
import com.spartaglobal.mondayspringproject.dto.FilmDTO;
import com.spartaglobal.mondayspringproject.dto.RentalDTO;
import com.spartaglobal.mondayspringproject.entities.Actor;
import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.entities.Rental;

public class DTOConverter {
    public static ActorDTO toDTO(Actor actor) {
        ActorDTO aDto = new ActorDTO();
        aDto.setId(actor.getId());
        aDto.setFirstName(actor.getFirstName());
        aDto.setLastName(actor.getLastName());
        return aDto;
    }

    public static RentalDTO toRentDTO(Rental rental){
        RentalDTO rDTO = new RentalDTO();
        rDTO.setId(rental.getId());
        rDTO.setRentalDate(rental.getRentalDate());
        rDTO.setReturnDate(rental.getReturnDate());
        rDTO.setLastUpdate(rental.getLastUpdate());
        return rDTO;
    }

    public static FilmDTO toFilmDTO(Film film){
        FilmDTO fDTO = new FilmDTO();
        fDTO.setId(film.getId());
        fDTO.setTitle(fDTO.getTitle());
        return fDTO;
    }
}
