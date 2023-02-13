package com.spartaglobal.mondayspringproject.repository;

import com.spartaglobal.mondayspringproject.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}