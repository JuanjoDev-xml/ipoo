public class Tester {
    public static void main(String[] args) {
        Refugio r1 = new Refugio(10, 5, 5);
        Criatura c1 = new Criatura(r1);
        System.out.println(c1.toString());

        c1.caminar();
        c1.caminar();

        System.out.println(c1.toString());

        c1.caminar();

        System.out.println(c1.toString());

        c1.caminar();

        System.out.println(c1.toString());

        c1.dormir();

        System.out.println(c1.toString());
        System.out.println(r1.toString());

        c1.comer();
        c1.beber();

        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(c1.obtenerHumor());

        c1.dormir();

        System.out.println(c1.estaDormido());

        c1.despertar();

        System.out.println(c1.estaDormido());
    }
}