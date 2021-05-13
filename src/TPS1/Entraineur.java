package TPS1;

public class Entraineur extends Personne{
    private String equipe;
    private int nbA;

    public Entraineur(String nom, String prenom, String genre, String metier, int age, String equipe, int nbA) {
        super(nom, prenom, genre, metier, age);
        this.equipe = equipe;
        this.nbA = nbA;
    }

    @Override
    public String toString() {
        return super.toString() + "Entraineur{" +
                "equipe='" + equipe + '\'' +
                ", nbA=" + nbA +
                '}';
    }
}
