package TP3;

public class Commune {
    Habitation[] tabH;
    String nom;

    public Commune(Habitation[] tabH, String nom) {
        this.tabH = tabH;
        this.nom = nom;
    }
    public double impot(){
        double total = 0.00;
        for(Habitation h: tabH){
            total += h.impot();
        }
        return total;
    }
}
