public class Course {

    private Voiture v1;
    private Voiture v2;
    private int longueur;

    private Course(Voiture v1, Voiture v2, int longueur) {
        this.v1 = v1;
        this.v2 = v2;
        this.longueur = longueur;

    }
    public  static int  random(int min, int max) {

        int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));
        return nombreAleatoire;
    }




}