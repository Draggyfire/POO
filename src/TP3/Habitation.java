package TP3;

public class Habitation {
    private String proprietaire,adresse;
    private int surface;


    public Habitation(String proprietaire, String adresse, int surface) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }

    public double impot(){
        return surface*2;
    }
    public void affiche(){
        System.out.println("Le proprietaire est " + proprietaire + " L'adresse est " + adresse + "La surface est de " + surface);
    }
}
