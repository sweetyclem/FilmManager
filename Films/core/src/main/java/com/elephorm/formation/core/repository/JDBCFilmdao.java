
package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class JDBCFilmdao implements FilmDaoInterface{
    private String driver;

    public JDBCFilmdao(String driver) {
        this.driver = driver;
    }
    
    @Override
    public  void save(Film film) {
        Connection con = null;
        
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elephorm", "clem", "pass");
            System.out.println("connexion ok");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO MOVIE (title, movie_type, copies) values (?, ?, ?)");
            pstmt.setString(1, film.getTitre());
            pstmt.setString(2, film.getGenre());
            pstmt.setInt(3, film.getNbExemplaires());
            pstmt.executeUpdate();
            
        } catch (Throwable e) {
            System.out.println("connexion ko");
            e.printStackTrace();
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
            }
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
