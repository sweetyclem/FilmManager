
package com.elephorm.formation.core.controller;

import com.elephorm.formation.core.entity.Acteur;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.service.FilmServiceInterface;
import java.util.List;
import java.util.Scanner;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class DefaultFilmController {
    @Resource
    private FilmServiceInterface service;    

    public FilmServiceInterface getService() {
        return service;
    }

    public void setService(FilmServiceInterface service) {
        this.service = service;
    }
    
    public void registerFilmFromConsoleInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le titre ?");
        String titre = sc.nextLine();
        System.out.println("Quel est le genre ?");
        String genre = sc.nextLine();
        System.out.println("Nom de l'actrice principale ?");
        String nom = sc.nextLine();
        System.out.println("Prénom de l'actrice principale ?");
        String prenom = sc.nextLine();
        System.out.println("Nombre d'exemplaires");
        int nb = sc.nextInt();
        
        Film film = new Film();
        film.setTitre(titre);
        film.setGenre(genre);
        film.setNbExemplaires(nb);
        Acteur acteur = new Acteur();
        acteur.setNom(nom);
        acteur.setPrenom(prenom);
        film.setActeurPrincipal(acteur);
        
        service.registerFilm(film);
    }
    
    public void decrireFilmFromConsoleInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du film ?");
        int nb = sc.nextInt();
        
        Film film = null;
        film = service.getFilmADecrire(nb);
        System.out.println("Le film est " + film.getTitre());
        System.out.println("L'actrice/eur principale/e est " + film.getActeurPrincipal().getPrenom() + " " + film.getActeurPrincipal().getNom());
        for (Acteur acteur : film.getActeursSecondaires()) {
            System.out.println("L'actrice/eur secondaire est " + acteur.getPrenom() + " " + acteur.getNom());
        }
    }
    
    public void listerFilms() {
        List<Film> films = service.getListeFilms();
        for (Film f : films) {
            System.out.println("Titre : " + f.getTitre());
            System.out.println("Genre : " + f.getGenre());
        }
    }
}
