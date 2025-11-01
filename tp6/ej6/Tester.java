public class Tester {
    public static void main(String[] args) {
        Refugio c1, c2, c4, clon1, clon2;
        RefugioVip c3, clon3;
        c1 = new Refugio(1,2,3);
        c2 = new RefugioVip(2,1,3,4);
        c3 = new RefugioVip(3,2,4,5);
        c4 = new RefugioVip(1,2,3,10);
        clon1 = c1.clone();
        clon2 = c2.clone();
        clon3 = c3.clone();

        System.out.println(" ");
        System.out.println(clon1.toString());
        System.out.println(clon2.toString());
        System.out.println(clon3.toString());

        if (c1.equals(c4)){
            System.out.println("Los refugios ");
            System.out.println(c1.toString());
            System.out.println(c4.toString());
            System.out.println("serían equivalentes en este diseño");
        }
    }
}
