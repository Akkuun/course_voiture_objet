public class Voiture {

    private String nom;
    private int position;
    private int vitesse;

    public Voiture(String nom, int vitesse) {
        this.nom = nom;
        this.vitesse = vitesse;
        this.position = 0;

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
