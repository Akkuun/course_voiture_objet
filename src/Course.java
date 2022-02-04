import java.util.Scanner;

public class Course {

    private Voiture v1;
    private Voiture v2;
    private int longueur;


    public Course(Voiture v1, Voiture v2, int longueur) {
        this.v1 = v1;
        this.v2 = v2;
        this.longueur = longueur;

    }

    public static float random(float min, float max) {

        float nombreAleatoire = min + (int) (Math.random() * ((max - min) + 1));
        return nombreAleatoire;
    }

    public float[] calculChanceEquitableRandom(){

        float somme=v1.getVitesse()+v2.getVitesse(); //on calcule en pourcentage le ratio par rapport à la vitesse
        float RatioV1=(v1.getVitesse())/somme;  //4
        float RatioV2=(v2.getVitesse())/somme; //8
        float[]ratio={RatioV1,RatioV2};   // 4/12
        return ratio;
    }

    public String toString() {
        String result = "Voiture 1 :" + v1.toString() + " " + "\n" + "Voiture 2 :" + v2.toString() + " " + "longueur :" + longueur;
        return result;
    }

    public Voiture deroulmenentAllerRetour() {
        boolean isGagant = false;
        v1.depart();
        v2.depart();
        Voiture gagnnant = new Voiture("", 0);
        float voiture_selection;


        while (!isGagant) { // tant que ya pas de gagnant faire

            if (v1.getPosition() < v2.getPosition() * 2) {
                v1.acceleration();
            }
            if (v1.getPosition()*2 > v2.getPosition()) {
                v2.acceleration();
            }
            float[] chance =this.calculChanceEquitableRandom();
            voiture_selection = random(chance[0], chance[1]); //selection aleatoire de voiture qui depend de la vitesse des voitures
            if (voiture_selection == 1) {
                if (!v1.getisArrivedAller()) {//tant que elle n'est pas arrive à l'aller faire
                    v1.avance();//elle avance
                    v1.toString2();//on affiche
                    if (v1.getPosition() >= longueur) {//si elle à depasser l'aller, elle doit maintenant faire le retour
                        v1.setArrivedAller(true);
                    }
                }
                if (v1.getisArrivedAller() && v1.getPosition() >= 0) {
                    v1.reculer();
                    v1.toString2();
                    if (v1.getPosition() <= 0) {
                        v1.setArrivedRetour(true);
                        gagnnant = v1;
                        isGagant = true;
                    }
                }
            }
            if (voiture_selection == 2) {
                if (!v2.getisArrivedAller()) {//tant que elle n'est pas arrive à l'aller faire

                    v2.avance();//elle avance
                    v2.toString2();//on affiche
                    if (v2.getPosition() >= longueur) {//si elle à depasser l'aller, elle doit maintenant faire le retour
                        v2.setArrivedAller(true);
                    }
                }
                if (v2.getisArrivedAller() && v2.getPosition() >= 0) {
                    v2.reculer();
                    v2.toString2();
                    if (v2.getPosition() <= 0) {
                        v2.setArrivedRetour(true);
                        gagnnant = v2;
                        isGagant = true;
                    }
                }
            }
        }
        System.out.println("Le gagnant est la voiture : " + gagnnant);
        return gagnnant;
    }

    public static Voiture CourseAllerRetour() { //static donc utilisable dans le Main
        Scanner scanf = new Scanner(System.in);
        System.out.println("entrer nom voiture 1 : ");
        String nom_1 = scanf.next();
        System.out.println("entrer vitesse voiture 1 : ");
        int vitesse_1 = scanf.nextInt();
        Voiture v1 = new Voiture(nom_1, vitesse_1);
        System.out.println("entrer nom voiture 2 : ");
        String nom_2 = scanf.next();
        System.out.println("entrer vitesse voiture 2 : ");
        int vitesse_2 = scanf.nextInt();
        Voiture v2 = new Voiture(nom_2, vitesse_2);
        System.out.println("entrer longueur course");
        int longueur1 = scanf.nextInt();
        Course c1 = new Course(v1, v2, longueur1);
        return c1.deroulmenentAllerRetour();
    }

    public static Voiture CourseAL() {
        return CourseAllerRetour();
    }
}