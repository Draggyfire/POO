package TP1;

public class Test{
    public static void main(String[] args){
        Personne p1 = new Personne("Delsol","Cameron",18);
        System.out.println(p1.valeursAttributs());
        p1.incAge();
        System.out.println(p1.majeure());
    }
}