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

    public Voiture deroulmenentAllerRetour() {
        boolean isGagant=false;
        v1.depart();
        v2.depart();
        Voiture gagnnant = new Voiture("", 0);


        while (!isGagant) { // tant que ya pas de gagnant faire

            int voiture_selection = random(1, 2); //selection aleatoire de voiture
            if (voiture_selection == 1) {
                if (!v1.getisArrivedAller()) {//tant que elle n'est pas arrive à l'aller faire

                    v1.avance();//elle avance
                    v1.toString2();//on affiche
                    if (v1.getPosition() >= longueur) {//si elle à depasser l'aller, elle doit maintenant faire le retour
                        v1.setArrivedAller(true);
                    }
                }
                if (v1.getisArrivedAller()&&v1.getPosition()>=0) {

                    v1.reculer();
                    v1.toString2();
                    if (v1.getPosition() <= 0) {
                        v1.setArrivedRetour(true);
                        gagnnant=v1;
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
                if (v2.getisArrivedAller()&&v2.getPosition()>=0) {

                    v2.reculer();
                    v2.toString2();
                    if (v2.getPosition() <= 0) {
                        v2.setArrivedRetour(true);
                        gagnnant=v2;
                        isGagant = true;

                    }

                }


            }
        }
        System.out.println("Le gagnant est la voiture : " + gagnnant);
        return gagnnant;
    }


    /*public  Voiture deroulementRetour() {

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
    }*/

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
        return c1.deroulmenentAllerRetour();
        // return c1.deroulementRetour();

    }


    public static Voiture CourseAL() {
        return CourseAllerRetour();
    }


}