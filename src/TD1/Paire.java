package TD1;

public class Paire {
    int ent1;
    int ent2;

    private Paire(int e1,int e2){
        this.ent1 = e1;
        this.ent2 = e2;
    }
    private Paire(){
        ent1 = 0;
        ent2 = 0;
    }
    private Paire(Paire p){
        this.ent1 = p.ent1;
        this.ent2 = p.ent2;
    }
    private int getEnt1(){
        return ent1;
    }

    public int getEnt2() {
        return ent2;
    }

    public void setEnt1(int ent1) {
        this.ent1 = ent1;
    }

    public void setEnt2(int ent2) {
        this.ent2 = ent2;
    }
    public boolean nulle(){
        return (this.ent1 == 0 && this.ent2 == 0);
    }
    public boolean inferieur(Paire p1,Paire p2){
        if ((p1.ent1 < p1.ent2) || (p1.ent1 == p1.ent2 && p2.ent1 < p2.ent2)){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Paire p0 = new Paire();
        Paire p1 = new Paire(1,2);
        Paire p2 = new Paire(3,4);
        p0.nulle();

    }
}
