
package com.elephorm.formation.core.service;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.repository.FilmDaoInterface;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmService implements FilmServiceInterface{
    @Resource
    private FilmDaoInterface dao;
    
    public  FilmService() {
        
    }

    public FilmService(FilmDaoInterface dao) {
        this.dao = dao;
    }
    
    @Override
    @Transactional
    public void registerFilm(Film film){
        dao.save(film);
    }
    @Override
    @Transactional
    public Film getFilmADecrire(int id) {
        Film film = dao.getByid(id);
        Hibernate.initialize(film.getActeurPrincipal());
        Hibernate.initialize(film.getActeursSecondaires());
        return film;
    }
    @Override
    @Transactional
    public List<Film> getListeFilms() {
        return dao.listFilm();
    }
}
