package TP2;

import java.util.Objects;

public class Auteur {
    private String reference;
    private String nom;
    private String prenom;
    private String nationalite;
    private int age;

    public Auteur(String reference,String nom,String prenom,String nationalite,int age){
        this.reference=reference;
        this.nom=nom;
        this.prenom=prenom;
        this.nationalite=nationalite;
        this.age=age;
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

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "reference='" + reference + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auteur auteur = (Auteur) o;
        return age == auteur.age && Objects.equals(reference, auteur.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, nom, prenom, nationalite, age);
    }
}
