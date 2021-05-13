package TPS1;

public class Joueur extends Personne{
    enum PosteJ { GARDIEN, DEFENSEUR, MILIEUDEF, MILIEUOFF, ATTAQUANT}
    private PosteJ poste;
    private String equipe;
    private int nbBut;

    public Joueur(String nom, String prenom, String genre, String metier, int age, PosteJ poste, String equipe, int nbBut) {
        super(nom, prenom, genre, metier, age);
        this.poste = poste;
        this.equipe = equipe;
        this.nbBut = nbBut;
    }

    @Override
    public String toString() {
        return super.toString()+"Joueur{" +
                "poste=" + poste +
                ", equipe='" + equipe + '\'' +
                ", nbBut=" + nbBut +
                '}';
    }
}
