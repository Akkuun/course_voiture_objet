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

    public static int random(int min, int max) {

        int nombreAleatoire = min + (int) (Math.random() * ((max - min) + 1));
        return nombreAleatoire;
    }

    public String toString() {
        String result = "Voiture 1 :" + v1.toString() + " " + "\n" + "Voiture 2 :" + v2.toString() + " " + "longueur :" + longueur;
        return result;
    }

    public Voiture deroulmenent() {
        boolean isarrived = false;
        v1.depart();
        v2.depart();
        Voiture gagnnant = new Voiture("", 0);


        while (!isarrived) {

            int voiture_selection = random(1, 2);
            if (voiture_selection == 1) {
                v1.avance();
                v1.toString2();

            } else if (voiture_selection == 2) {
                v2.avance();
                v2.toString2();
            }


            if (v1.getPosition() >= longueur) {
                isarrived = true;
                gagnnant = v1;
            } else if (v2.getPosition() >= longueur) {
                isarrived = true;
                gagnnant = v2;

            }


            //System.out.flush();
        }
        //System.out.println("Le gagnant est la voiture : " + gagnnant);
        return gagnnant;
    }


    public  Voiture deroulementRetour() {

        boolean isArrived = false;

        Voiture gagnant = new Voiture("toto", 0);


        while (!isArrived) {

            int voiture_selection = random(1, 2);
            if (voiture_selection == 1) {
                v1.reculer();
                v1.toString2();

            } else if (voiture_selection == 2) {
                v2.reculer();
                v2.toString2();
            }


            if (v1.getPosition() <= 0) {
                isArrived=true;
                gagnant=v1;

            } else if (v2.getPosition() <= 0) {
                isArrived = true;
                gagnant = v2;

            }



        }
        System.out.println("le gagnant est : "+gagnant);
        return gagnant;
    }

    public static Voiture CourseAllerRetour() {

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
         c1.deroulmenent();
         return c1.deroulementRetour();

    }


    public static Voiture CourseAL() {
        return CourseAllerRetour();
    }


}