package TP1;

public class Etudiant {

    String prenom;
    String nom;

    public Etudiant(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public static void main(String[] args){
        Etudiant student = new Etudiant("toto", "Cameron");
        System.out.println("Prenom "+student.prenom+" et le nom "+student.nom);
    }
}
