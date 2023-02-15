package com.spartaglobal.mondayspringproject.dto;

public class FilmActorDTO {
    private Integer actor_id;
    private Integer film_id;

    public Integer getActor_id() {
        return actor_id;
    }

    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    @Override
    public String toString() {
        return "FilmActorDTO{" +
                "actor_id=" + actor_id +
                ", film_id=" + film_id +
                '}';
    }
}
