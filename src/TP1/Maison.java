package TP1;

public class Maison {
    private String adresse;
    private int superficie;
    private Proprietaire proprio;
    private int prix;

    public Maison(String adresse,int superficie,Proprietaire proprio,int prix){
        this.adresse=adresse;
        this.superficie=superficie;
        this.proprio=proprio;
        this.prix=prix;
    }

    public Maison(String adresse,int superficie,Proprietaire proprio){
        this.adresse=adresse;
        this.superficie=superficie;
        this.proprio=proprio;
        prix=-1;
    }

    public int getPrix() {
        return prix;
    }

    public int getSuperficie() {
        return superficie;
    }

    public Proprietaire getProprio() {
        return proprio;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setProprio(Proprietaire proprio) {
        this.proprio = proprio;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public void affichage(){
        System.out.println("La maison est située au " + adresse);
        System.out.println("Elle possède une superficie de " + superficie);
        System.out.println("Son propriétaire est");
        proprio.affichage();
        System.out.println("Son prix est de " + prix + "$");
    }
    public boolean eval(){
        return prix != -1;
    }
}
