package TP2;

public class Bibliotheque {
    private static final int MAXEX = 100;
    private static final int MAXLIVRE = 1000;
    private String nom;
    private Livre[] tabLivre;
    private int nbLivre;

    public Bibliotheque(String nom){
        this.nom = nom;
        tabLivre = new Livre[MAXLIVRE];
        nbLivre=0;
    }

    public void ajoutLivre(Livre livre){
        if (nbLivre <MAXLIVRE){
            for (int i =0;i< nbLivre;i++){
                if(livre.equals(tabLivre[i]) && tabLivre[i].getNbEx()+livre.getNbEx()<MAXEX){
                    tabLivre[i].ajoutEx(livre.getNbEx());
                }
                else{
                    ajoutTablivre(livre);
                }
            }
        }

    }
    private void ajoutTablivre(Livre l){
        for(int i = 0;i<tabLivre.length;i++){
            if(tabLivre == null) tabLivre[i]=l;
        }
    }
    public class TriSelection{
        public int min(Livre[] t,int i){
            int indiceMin=i;
            int indice = i+1;
            while(indice<t.length){
                if (t[indiceMin].getNbEx()>t[indice].getNbEx()) indiceMin=indice;
                indice++;
            }
            return indiceMin;
        }
        public void echanger(Livre[] t,int x, int y){
            Livre tmp =t[x];
            t[x]=t[y];
            t[y]=tmp;
        }
        public void tri(Livre[] t){
            int indiceMin;
            for(int i = 0;i< t.length-1;i++){
                indiceMin = min(t,i);
                echanger(t,i,indiceMin);
            }
        }
    }
}