public class Main {
    public static void main(String[] args) {
        Voiture d1 = new Voiture("cars", 2);
        Voiture d2 = new Voiture("toto", 2);

        Course c1 = new Course(d1, d2, 12);
        c1.deroulmenent();


    }


}
