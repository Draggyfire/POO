package TD1;

public class Point {
    // deux attributs de type int
    int abscisse;
    int ordonnee;
    static int nombre = 0 ;
    int numero ;

    // Constructeurs

    private Point(){
        abscisse = 0 ;
        ordonnee = 0 ;
        nombre++;
        numero = nombre;
    }
    public Point(int u, int v){
        abscisse = u;
        ordonnee = v;
        nombre++;
        numero = nombre;
    }
    // methode permettant de changer les coordonnees d’un point
    private void set( int u , int v ){
        abscisse = u ;
        ordonnee = v ;
    }

    public void set(Point p){
        abscisse = p.abscisse;
        ordonnee = p.ordonnee;
    }
    // methode permettant de translater un point
    private void translate( int u , int v ){
        abscisse = abscisse + u ;
        ordonnee = ordonnee + v ;
    }
    private void affiche(){
        System.out.println(this.abscisse + " , " +this.ordonnee +" "+numero);
    }
    private boolean origine(){
        if (this.abscisse == 0 && this.ordonnee == 0) return true;
        else return false;
    }
    private boolean egale(Point p){
        return (p.abscisse == abscisse && p.ordonnee == ordonnee);
    }
    public Point symetrie(){
        return new Point(-1*abscisse,-1*ordonnee);
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.affiche();
        p2.affiche();
        p1.set(3,8);
        p1.affiche();
        System.out.println(p1.symetrie().abscisse+" , "+p1.symetrie().ordonnee);

    }

}
