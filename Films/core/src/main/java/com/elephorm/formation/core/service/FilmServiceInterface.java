package com.elephorm.formation.core.service;

import com.elephorm.formation.core.entity.Film;
import java.util.List;

public interface FilmServiceInterface {
    public void registerFilm(Film film);
    public Film getFilmADecrire(int id);
    public List<Film> getListeFilms();
}
