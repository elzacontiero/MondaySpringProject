package com.spartaglobal.mondayspringproject.repositories;

import com.spartaglobal.mondayspringproject.entities.FilmActor;
import com.spartaglobal.mondayspringproject.entities.FilmActorId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmActorRepository extends JpaRepository<FilmActor, FilmActorId> {
    List<FilmActor> findAllByActor_Id(Integer id);
}