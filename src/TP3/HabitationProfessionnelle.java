package TP3;

public class HabitationProfessionnelle extends Habitation{
    private int nbE;

    public HabitationProfessionnelle(String proprietaire, String adresse, int surface, int nbE) {
        super(proprietaire, adresse, surface);
        this.nbE = nbE;
    }

    @Override
    public double impot() {
        int mille = (nbE/10)*1000;
        return super.impot()+mille;
    }

    @Override
    public void affiche() {
        super.affiche();
    }
}
