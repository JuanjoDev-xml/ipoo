public class Tester {
    public static void main(String[] args){
        Hora h1 = new Hora(6, 15);
        Hora h2 = new Hora(7,0);
        Hora h3 = new Hora(18, 30);
        Hora h4 = new Hora(22, 0);
        Hora h5 = new Hora(22, 15);

        System.out.println("Se espera true");
        System.out.println(h1.anterior(h2));
        System.out.println("Se espera false");
        System.out.println(h4.anterior(h3));

        Vehiculo v1 = new Vehiculo(h1, 1, "JUAN");
        Vehiculo v2 = new Vehiculo(h2, 2, "GIAN");
        Vehiculo v3 = new Vehiculo(h3, 3, "FACU");
        Vehiculo v4 = new Vehiculo(h4, 4, "AGUS");
        Vehiculo v5 = new Vehiculo(h5, 5, "NICO");

        System.out.println(v1.obtenerIngreso());
        System.out.println(v1.obtenerEgreso());
    }
}
