package TP1;

public class Personne {

    String nom, prenom;
    int age;

    public Personne(String n, String p, int a) {
        nom = n;
        prenom = p;
        age = a;
    }

    public String valeursAttributs() {

        return (nom + " " + prenom);
    }

    public void incAge() {

        age++;
    }

    public boolean majeure() {
        return (age > 18);
    }
    public static void main(String[] args) {
    }
}
