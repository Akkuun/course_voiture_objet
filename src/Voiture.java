public class Voiture {

    private String nom;
    private int position;
    private int vitesse;

    public Voiture(String nom, int vitesse) {
        this.nom = nom;
        this.vitesse = vitesse;

    }

    public String toString() {
        String texte = "nom: " + nom + "  " + "vitesse : " + String.valueOf(vitesse);
        return texte;
    }

    public String toString2() {
        for (int i = 0; i < position; i++) {
            System.out.println(" ");
        }
        String lettre = nom;
        char resuslt = lettre.charAt(0);
        System.out.println(resuslt);
        System.out.println("\n");
        return lettre;
    }

    public String getNom() {
        return nom;

    }
    public boolean depasse(int limite){
        return position>=limite;
    }
    public void avance(){
        for (int i=0;i<vitesse;i++)
            System.out.println(" ");
    }
    public void depart(){
position=0;
    }

}
