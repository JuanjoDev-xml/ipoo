public class Tester {
    public static void main(String[] args) {
        Dispositivo s1 = new Dispositivo(1, 2);
        Dispositivo s2 = new DispositivoFull(1, 2, 3, 2);
        DispositivoFull s3 = new DispositivoFull(1, 2, 3, 4);
        DispositivoFull s4 = new DispositivoFull(1, 2, 3, 1);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(s2));
        System.out.println(s3.equals(s4));
    }
}
