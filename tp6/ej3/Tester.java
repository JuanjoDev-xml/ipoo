public class Tester {
    public static void main(String[] args) {
        Base u1, u2, u3, u4;
        Hija d1, d2;
        Nieta t;
        t = new Nieta();
        u1 = new Base();
        u2 = new Hija();
        u3 = new Nieta();
        u4 = t;
        d1 = new Hija();
        d2 = new Nieta();

        System.out.println(" ");
        System.out.println(u1.f());
        System.out.println(u2.f());
        System.out.println(u3.f());
        System.out.println(u4.f());
        System.out.println(u1.g());
        System.out.println(u2.g());
        System.out.println(u3.g());
        System.out.println(u4.g());
        System.out.println(u1.h());
        System.out.println(u2.h());
        System.out.println(u3.h());
        System.out.println(u4.h());
        System.out.println(d1.f());
        System.out.println(d2.f());
        System.out.println(d1.f(-1));
        System.out.println(d2.f(-1));
        System.out.println(d1.g());
        System.out.println(d2.g());
        System.out.println(d1.h());
        System.out.println(d2.h());
        System.out.println(t.f());
        System.out.println(t.g());
        System.out.println(t.h());
        System.out.println(t.f(-1));
        System.out.println(t.l());
    }
}
