package com.spartaglobal.mondayspringproject.repositories;

import com.spartaglobal.mondayspringproject.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Short> {
    Language findLanguageById(int id);
}