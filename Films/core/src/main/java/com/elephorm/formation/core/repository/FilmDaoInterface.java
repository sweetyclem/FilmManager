package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import java.util.List;

public interface FilmDaoInterface {
    public  void save(Film film);
    public  Film getByid(int id);
    public List<Film> listFilm();
}
