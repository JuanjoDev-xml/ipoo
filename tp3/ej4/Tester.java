public class Tester {
    public static void main(String[] args){
        Color c1, c2, c3, c4;
        Borde b1, b2, b3, b4, b5, b6, b7;
        c1 = new Color(110, 110, 110);
        c2 = new Color(110, 110, 110);
        c3 = c1;
        c4 = c1.clone();
        b1 = new Borde(1, c1);
        b2 = new Borde(1, c2);
        b3 = b2.clone();
        b4 = new Borde(b2.obtenerGrosor(), b2.obtenerColor());
        b5 = b2;
        b6 = new Borde(1,c3);
        b7 = new Borde(1,c4);

        System.out.println((c1 == c2) + " " + (c1 == c3) + " "+ (c1 == c4));
        System.out.println( c1.equals(c2) + " " + c1.equals(c3) + " " + c1.equals(c4));
        System.out.println((b2 == b3) + " " + (b2 == b4) + " " + (b2 == b5) + " " + (b2 == b6) + " " + (b2 == b7));
        System.out.println(b2.equals(b1));
        System.out.println(b2.equals(b3));
        System.out.println(b2.equals(b4));
        System.out.println(b2.equals(b5));
        System.out.println(b2.equals(b6));
        System.out.println(b2.equals(b7));
        System.out.println(b2.obtenerGrosor() == b1.obtenerGrosor() &
        b2.obtenerColor() == b1.obtenerColor());
        System.out.println(b2.obtenerGrosor() == b3.obtenerGrosor() &
        b2.obtenerColor() == b3.obtenerColor());
        System.out.println(b2.obtenerGrosor() == b1.obtenerGrosor() &
        b2.obtenerColor().equals(b1.obtenerColor()));
        System.out.println(b2.obtenerGrosor() == b4.obtenerGrosor() &
        b2.obtenerColor().equals(b4.obtenerColor()));
        System.out.println(b2.obtenerGrosor() == b6.obtenerGrosor() &
        b2.obtenerColor().equals(b6.obtenerColor()));
        System.out.println(b2.obtenerGrosor() == b7.obtenerGrosor() &
        b2.obtenerColor().equals(b7.obtenerColor()));
    }
}