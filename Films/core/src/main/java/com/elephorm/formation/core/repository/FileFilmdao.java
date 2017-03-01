
package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import java.io.FileWriter;
import java.util.List;


public class FileFilmdao implements FilmDaoInterface{
    @Override
    public  void save(Film film) {
        FileWriter writer;
        
        try {
            writer = new FileWriter("C:\\tmp\\films.txt", true);
            writer.write(film.getTitre() + ";" + film.getGenre() + ";" + film.getNbExemplaires()+"\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public Film getByid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Film> listFilm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
