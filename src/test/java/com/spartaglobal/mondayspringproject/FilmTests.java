package com.spartaglobal.mondayspringproject;

import com.spartaglobal.mondayspringproject.entities.Film;
import com.spartaglobal.mondayspringproject.entities.Language;
import com.spartaglobal.mondayspringproject.repositories.FilmRepository;
import com.spartaglobal.mondayspringproject.repositories.LanguageRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Optional;
@SpringBootTest
@Transactional
public class FilmTests {

    @Autowired
    private FilmRepository filmRepo;

    @Autowired
    private LanguageRepository langRepo;

    @Test
    public void testAddFilm(){
        Film newFilm = new Film();
        newFilm.setId(0);
        newFilm.setTitle("Intellij");
        newFilm.setDescription("The program will close down");
        newFilm.setRating("G");
        newFilm.setLastUpdate(Instant.now());
        newFilm.setReplacementCost(BigDecimal.valueOf(2.33));
        newFilm.setLength(200);
        newFilm.setRentalRate(BigDecimal.valueOf(4.53));
        newFilm.setReleaseYear(2015);
        newFilm.setSpecialFeatures("Trailers");
        newFilm.setRentalDuration((short) 5);

        Optional<Language> tempLang = langRepo.findById((short)1);
        Language lang = tempLang.get();

        newFilm.setLanguage(lang);

        Film finalFilm = filmRepo.save(newFilm);

        Optional<Film> findFilm = filmRepo.findById(finalFilm.getId());
        Assertions.assertTrue(findFilm.isPresent());
        System.out.println(finalFilm);

        Film foundFilm = findFilm.get();

        System.out.println(foundFilm);

        Assertions.assertEquals("Intellij", foundFilm.getTitle());


    }
}
