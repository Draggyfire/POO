package TP1;



public class Exo8 {

    public static boolean plusDeVoy(String mot){
        int nbVoy = 0;
        String voy = "aeiouy";
        for(int i=0;i<mot.length();i++){
            for(int y=0;y<voy.length();y++){
                if(mot.charAt(i) == voy.charAt(y)){
                    nbVoy++;
                }
            }
        }
        return nbVoy >= mot.length() - nbVoy;

    }

    public static void main(String[] args) {
    }
}