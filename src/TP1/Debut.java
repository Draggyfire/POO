package TP1;

public class Debut{
    //attribut
    String message = "Hello World!";
    /*
    ma première méthode
    */
    public void afficher(){
        System.out.println(message);
    }
    public static void main(String[] args){
        // création d’un objet de type Debut
        Debut obj = new Debut();
        //appel de la méthode afficher
        obj.afficher();
    }
}