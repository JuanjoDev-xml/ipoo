public class Tester {
    public static void main(String[] args) {
        Alfa a1 = new Alfa();
        Alfa a2 = new Beta();
        Beta b = new Beta();
        Delta d1 = new Delta();
        Delta d2 = new Gama();
        Gama g = new Gama();

        System.out.println(d1.v1(a1));
        System.out.println(d1.v2(a1));
        System.out.println(d1.v1(a2));
        System.out.println(d1.v2(a2));
        System.out.println(d1.v1(b));
        System.out.println(d1.v2(b));
        
        System.out.println(d2.v1(a1));
        System.out.println(d2.v2(a1));
        System.out.println(d2.v1(a2));
        System.out.println(d2.v2(a2));
        System.out.println(d2.v1(b));
        System.out.println(d2.v2(b));
        
        System.out.println(g.v1(a1));
        System.out.println(g.v2(a1));
        System.out.println(g.v1(a2));
        System.out.println(g.v2(a2));
        System.out.println(g.v1(b));
        System.out.println(g.v2(b));
    }
}
