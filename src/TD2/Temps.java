package TD2;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps(){
        this.heures = 0;
        this.minutes = 0;
        this.secondes = 0;
    }
    public Temps(int heures){
        this.heures = heures;
        this.minutes = 0;
        this.secondes = 0;
    }
    public Temps(int heures,int minutes){
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = 0;
    }

    public Temps(int heures,int minutes,int secondes){
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }
    public Temps(Temps temps){
        this.heures = temps.heures;
        this.minutes = temps.minutes;
        this.secondes = temps.secondes;
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void ajouterHeures(int h){
        this.heures += h;
    }

    public void ajouterMinutes(int m){
        this.minutes += m;
    }

    public void ajouterSecondes(int s){
        this.secondes += s;
    }

}
