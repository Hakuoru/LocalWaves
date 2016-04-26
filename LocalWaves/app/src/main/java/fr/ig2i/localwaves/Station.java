package fr.ig2i.localwaves;

public class Station {

    long frequence;
    String nom;
    Boolean statut;
    Boolean favoris;

    public Station() {
    }

    public long getFrequence() {
        return frequence;
    }

    public void setFrequence(long frequence) {
        this.frequence = frequence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Boolean getFavoris() {
        return favoris;
    }

    public void setFavoris(Boolean favoris) {
        this.favoris = favoris;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Station{" +
                "frequence=" + frequence +
                ", nom='" + nom + '\'' +
                ", statut=" + statut +
                ", favoris=" + favoris +
                '}';
    }

}
