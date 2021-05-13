package TPS1;

public class Demo {
    private final int MAX = 100;
    private Personne[] tabP;

    public Demo(Personne[] tabP) {
        if(tabP.length <= MAX){
            this.tabP = new Personne[tabP.length];
            for(int i=0;i<= tabP.length;i++){
                this.tabP[i]=tabP[i];
            }
        }
    }
}
