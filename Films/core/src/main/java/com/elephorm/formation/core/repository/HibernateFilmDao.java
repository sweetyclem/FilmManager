
package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateFilmDao implements FilmDaoInterface {
    
    @Resource
    private SessionFactory sessionFactory;
    
    @Override
    public  void save(Film film) {
        Session session = sessionFactory.getCurrentSession();
        film.setGenre(null);
        session.persist(film);
    }
    
    @Override
    public  Film getByid(int id) {
        Session session = sessionFactory.getCurrentSession();
        Film film = null;
        film = (Film) session.get(Film.class, id);
        return film;
    }
    
    @Override
    public List<Film> listFilm() {
        Session session = sessionFactory.getCurrentSession();
        List<Film> films = null;
        Query query = session.createQuery("from Film");
        films = query.list();
        return films;
    }
}
 