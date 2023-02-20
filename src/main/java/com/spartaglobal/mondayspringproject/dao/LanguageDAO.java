package com.spartaglobal.mondayspringproject.dao;

import com.spartaglobal.mondayspringproject.dto.FilmDTO;
import com.spartaglobal.mondayspringproject.entities.Language;
import com.spartaglobal.mondayspringproject.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LanguageDAO {

    private LanguageRepository langRepo;


    public LanguageDAO(LanguageRepository langRepo){
        this.langRepo = langRepo;
    }

    public Language getLanguage(FilmDTO jsonBody){
        Language language = langRepo.findLanguageById(jsonBody.getLanguageId());
        return language;
    }
}
