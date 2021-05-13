package TPS1;

public class Personne {
    private String nom,prenom,genre,metier;
    private int age;

    public Personne(String nom, String prenom, String genre, String metier, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.metier = metier;
        this.age = age;
    }
    public Personne(String nom, String prenom, String metier, int age){
        new Personne(nom,prenom,"Non_spécifié",metier,age);
    }
    public Personne(String nom, String prenom, int age){
        new Personne(nom,prenom,"Non_spécifié","Non_spécifié",age);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", genre='" + genre + '\'' +
                ", metier='" + metier + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGenre() {
        return genre;
    }

    public String getMetier() {
        return metier;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
