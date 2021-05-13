package TP1;

public class Proprietaire {
    private String nom;
    private String prenom;

    public Proprietaire(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public static boolean equals(Proprietaire p1, Proprietaire p2){
        return (p1.prenom == p2.prenom && p1.nom == p2.nom);
    }

    public void affichage(){
        System.out.println("Le nom est "+nom+" et le prénom est "+prenom);
    }
}
