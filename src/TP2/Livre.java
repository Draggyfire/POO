package TP2;

public class Livre {
    private int reference;
    private String titre;
    private Auteur auteur;
    private String editeur;
    private int nbEx;

    enum Genre {FRANCAIS, ETRANGERE, JEUNESSE, SCIFI, POLICIER, NON_SPECIFIE}

    private Genre g;

    public Livre(int reference, String titre, Auteur auteur, String editeur, int nbEx, Genre g) {
        this.reference = reference;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.nbEx = nbEx;
        this.g = g;
    }

    public Livre(int reference, String titre, Auteur auteur, String editeur, int nbEx) {
        new Livre(reference, titre, auteur, editeur, nbEx, Genre.NON_SPECIFIE);
    }

    public int getReference() {
        return reference;
    }

    public int getNbEx() {
        return nbEx;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public Genre getG() {
        return g;
    }

    public String getTitre() {
        return titre;
    }

    public String toString() {
        return "Livre{" +
                "reference=" + reference +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", editeur='" + editeur + '\'' +
                ", nbEx=" + nbEx +
                ", genre='" + g + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return reference == livre.reference;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void ajoutEx() {
        nbEx++;
    }

    public void ajoutEx(int nb) {
        if (nb > 0) {
            nbEx += nb;
        }
    }

    public void perteEx() {
        if (nbEx > 0) {
            nbEx -= 1;
        }
    }

    public boolean livreDispo() {
        if (nbEx > 0) return true;
        else return false;
    }
}

