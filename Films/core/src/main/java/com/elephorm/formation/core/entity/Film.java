
package com.elephorm.formation.core.entity;

import java.util.Set;

public class Film {
    private Integer id;
    private String titre;
    private String genre;
    private Integer nbExemplaires;
    private Acteur acteurPrincipal;
    private Set<Acteur> acteursSecondaires;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNbExemplaires() {
        return nbExemplaires;
    }

    public void setNbExemplaires(Integer nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }

    public Acteur getActeurPrincipal() {
        return acteurPrincipal;
    }

    public void setActeurPrincipal(Acteur acteur) {
        this.acteurPrincipal = acteur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Acteur> getActeursSecondaires() {
        return acteursSecondaires;
    }

    public void setActeursSecondaires(Set<Acteur> acteursSecondaires) {
        this.acteursSecondaires = acteursSecondaires;
    }
    
}
