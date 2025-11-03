public class Tester {
    public static void main(String[] args) {
        Sensor s1 = new Sensor(1, 2);
        Sensor s2 = new SensorAlfa(1, 2, 3, 4);
        SensorAlfa s3 = new SensorAlfa(1, 2, 3, 4);

        System.out.println(" ");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(s2));
    }
}
