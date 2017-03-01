
package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import java.util.List;


public class InMemoryFilmDao implements FilmDaoInterface{
    
    private List<Film> films;

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Override
    public void save(Film film) {
       
    }

    @Override
    public Film getByid(int id) {
        throw new UnsupportedOperationException("Pas de méthode getById dans InMemoryFilmDao"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Film> listFilm() {
        return films;        
    }

}
