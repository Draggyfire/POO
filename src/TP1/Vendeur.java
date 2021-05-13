package TP1;

public class Vendeur {
    private String nom;
    private String prenom;
    private Maison[] listeMaison;
    private int nbMaison;
    private final int MAX = 20;

    public Vendeur(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
        listeMaison = new Maison[MAX];
        nbMaison=0;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getMAX() {
        return MAX;
    }

    public int getNbMaison() {
        return nbMaison;
    }

    public Maison[] getListeMaison() {
        return listeMaison;
    }

    public boolean verifProprio(Proprietaire p1){
        boolean trouve = false;
        for(Maison m: listeMaison){
            if (p1 == m.getProprio()) trouve = true;
        }
        return trouve;
    }

    public void ajouteMaison(Maison m){
        for(int i = 0;i<listeMaison.length;i++){
            if (listeMaison[i]== null){
                listeMaison[i]= m;
                break;
            }
        }
    }

    public void supprMaison(String adresse){
        for(int i = 0;i<listeMaison.length;i++){
            if (listeMaison[i].getAdresse() == adresse){
                listeMaison[i]= null;
                break;
            }
        }
    }

    public int plusGrande(){
        int supMax = -1;
        for(Maison m : listeMaison){
            if (m.getSuperficie()>supMax){
                supMax = m.getSuperficie();
            }
        }
        return supMax;
    }
    public int prixMoyen(){
        int tot = 0;
        int nbMEval=0;
        for(Maison m : listeMaison){
            if (m.getPrix() != -1){
                tot+=m.getPrix();
                nbMEval+=1;
            }
        }
        return tot/nbMEval;

    }

}
