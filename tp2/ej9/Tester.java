public class Tester {
    public static void main(String[] args) {
        System.out.println((new Color()).toString());
        Color c1 = new Color(300, -2, 0);
        System.out.println(c1.toString());
        c1.variarRojo(-100);
        c1.variarAzul(40);
        c1.variarVerde(100);
        System.out.println("Se espera: 155 40 100");
        System.out.println(c1.toString());
        c1.variar(10);
        System.out.println("Se espera 165 50 110");
        System.out.println(c1.toString());
        c1.establecerAzul(0);
        c1.establecerRojo(0);
        c1.establecerVerde(0);
        System.out.println("Se espera true");
        System.out.println(c1.esNegro());
        c1.variar(100);
        Color c2 = new Color(100, 100, 100);
        System.out.println("Se espera true");
        System.out.println(c1.equals(c2));
        Color c3 = c2.clone();
        System.out.println(c3.equals(c1));
    }
}
