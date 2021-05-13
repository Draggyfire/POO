package TP3;

public class HabitationIndividuelle extends Habitation{
    private int nbPieces;
    private boolean piscine;

    public HabitationIndividuelle(String proprietaire, String adresse, int surface) {
        super(proprietaire,adresse,surface);
    }

    @Override
    public double impot() {
        if(piscine){
            return super.impot()+100*nbPieces+ 500;
        }else{
            return super.impot()+100*nbPieces;
        }

    }
    public void affichage(){
        super.affiche();
    }
}
