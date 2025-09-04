public class Tester {
    public static void main(String[] args) {
        Libro l1 = new Libro("Hábitos", "Juan", "Santillana", 'A');

        Fecha f1 = new Fecha(20, 8, 2025);
        Fecha f2 = new Fecha(29, 8, 2025);
        Fecha f3 = new Fecha(30, 8, 2025);
        Fecha today = new Fecha(4, 9, 2025);

        Prestamo p1 = new Prestamo(l1, f1, f3, "Jose");
        Prestamo p2 = new Prestamo(l1, f2, f3, "Pepe");

        System.out.println(p1.obtenerLibro());
        System.out.println(p2.obtenerLibro());
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println("Debería dar el de Jose");
        System.out.println(p1.masAntiguo(p2));

        System.out.println("Debería dar false"); // error ?????????????? (da true)
        System.out.println(p2.estaAtrasado(today));

        f2.establecerDia(31);
        System.out.println("Debería dar true");
        System.out.println(p2.estaAtrasado(today));

        System.out.println("Debería dar false");
        System.out.println(p1.equals(p2));
        Prestamo p3 = new Prestamo(l1, f1, f3, "Jose");
        System.out.println("Debería dar true");
        System.out.println(p1.equals(p3));
    }
}
