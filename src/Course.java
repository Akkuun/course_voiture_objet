public class Course {

    private Voiture v1;
    private Voiture v2;
    private int longueur;

    public Course(Voiture v1, Voiture v2, int longueur) {
        this.v1 = v1;
        this.v2 = v2;
        this.longueur = longueur;

    }

    public static int random(int min, int max) {

        int nombreAleatoire = min + (int) (Math.random() * ((max - min) + 1));
        return nombreAleatoire;
    }

    public String Tostring() {
        String result = "Voiture 1 :" + v1.toString() + " " + "Voiture 2 :" + v2.toString() + " " + "longueur :" + longueur;
        return result;
    }


}