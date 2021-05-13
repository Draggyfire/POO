package TP1;

public class Auteur {
    private String reference, nom, prenom, nationalite;
    private int age;

    public Auteur(String reference, String nom, String prenom, String nationalite, int age) {
        this.reference = reference;
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.age = age;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public boolean equals(Auteur auteur2) {
        return (this.reference == auteur2.reference);
    }

    public String toString() {
        return "Nom: " + this.nom + "Prenom: " + this.prenom + "Age: " + this.age + "Nationalite: " + this.nationalite + "Référence: " + this.reference;
    }

    public static void main(String[] args) {
        Auteur a1 = new Auteur("#001", "bob", "ross", "italien", 33);
        System.out.println(a1.toString());
    }
}
