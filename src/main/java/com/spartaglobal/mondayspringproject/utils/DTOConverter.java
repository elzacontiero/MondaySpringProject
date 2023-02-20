package com.spartaglobal.mondayspringproject.utils;

import com.spartaglobal.mondayspringproject.dto.ActorDTO;
import com.spartaglobal.mondayspringproject.dto.RentalDTO;
import com.spartaglobal.mondayspringproject.entities.Actor;
import com.spartaglobal.mondayspringproject.entities.Rental;
import com.spartaglobal.mondayspringproject.entities.Staff;

import java.util.Optional;

public class DTOConverter {
    public static ActorDTO toDTO(Actor actor) {
        ActorDTO aDto = new ActorDTO();
        aDto.setId(actor.getId());
        aDto.setFirstName(actor.getFirstName());
        aDto.setLastName(actor.getLastName());
        return aDto;
    }

    public static RentalDTO toRentalDTO(Rental rental) {
        RentalDTO rDto = new RentalDTO();
        rDto.setId(rental.getId());
        rDto.setRentalDate(rental.getRentalDate());
        rDto.setReturnDate(rental.getReturnDate());
        rDto.setLastUpdate(rental.getLastUpdate());
        return rDto;
    }

    public static RentalDTO toFullRentalDTO(Rental rental) {
        RentalDTO rDto = new RentalDTO();
        rDto.setId(rental.getId());
        rDto.setRentalDate(rental.getRentalDate());
        rDto.setReturnDate(rental.getReturnDate());
        rDto.setLastUpdate(rental.getLastUpdate());
        Staff addStaffId = rental.getStaff();
        rDto.setStaffId(rental.getStaff().getId());
       // rDto.setStaffId(addStaffId.getId());
        return rDto;
    }
}

