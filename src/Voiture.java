public class Voiture {

    private String nom;
    private int position;
    private int vitesse;
    private boolean isArrivedAller;
    private boolean isArrivedRetour;

    public Voiture(String nom, int vitesse) {
        this.nom = nom;
        this.vitesse = vitesse;
        this.position = 0;
        this.isArrivedAller=false;
        this.isArrivedRetour=false;

    }

    public boolean getisArrivedAller() {
        return isArrivedAller;
    }

    public void setArrivedAller(boolean arrivedAller) {
        isArrivedAller = arrivedAller;
    }

    public void setArrivedRetour(boolean arrivedRetour) {
        isArrivedRetour = arrivedRetour;
    }

    public boolean getisArrivedRetour() {
        return isArrivedRetour;
    }

    public String toString() {
        String texte = "nom: " + nom + "  " + "vitesse : " + vitesse;
        return texte;
    }

    public String toString2() {
        String lettre = "";
        for (int i = 0; i < position; i++) {
            lettre += " ";
        }
        char resuslt = nom.charAt(0);
        lettre += resuslt + "\n";
        System.out.println(lettre);
        return lettre;
    }


    public String getNom() {
        return nom;

    }

    public int getPosition() {
        return position;
    }

    public boolean depasse(int limite) {
        return position >= limite;
    }

    public void avance() {

        position += vitesse;

    }

    public void reculer() {
        position -= vitesse;
    }

    public void depart() {
        position = 0;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}
