public class Main {
    public static void main(String[] args) {
        Voiture d1 = new Voiture("cars", 300);
        Voiture d2 = new Voiture("toto", 70);
        System.out.println(d1.toString());
        d1.toString2();
        Course c1 = new Course(d1, d2, 120);
        System.out.println(c1.toString());
    }


}
