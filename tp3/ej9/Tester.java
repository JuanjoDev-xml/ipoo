public class Tester {
    public static void main(String[] args){

        Tarifa tarifa = new Tarifa(10, 20, 40, 100);


        Hora h1 = new Hora(6, 15);
        Hora h2 = new Hora(7,0);
        Hora h3 = new Hora(18, 30);
        Hora h4 = new Hora(22, 0);
        Hora h5 = new Hora(22, 15);
        Hora h6 = new Hora(22, 15);

        Hora h33 = new Hora(18, 30);

        System.out.println("Se espera true");
        System.out.println(h1.anterior(h2));
        System.out.println("Se espera false");
        System.out.println(h4.anterior(h3));
        System.out.println("Se espera true");
        System.out.println(h5.equals(h6));
        System.out.println("Se espera false");
        System.out.println(h2.equals(h4));
        System.out.println("Se espera 45");
        System.out.println(h1.diferenciaMinutos(h2));

        // ------------- PROBANDO VEHICULO -------------------------------
        System.out.println("------------------ PROBANDO VEHICULO -------");

        Vehiculo v1 = new Vehiculo(h1, 1, "JUAN");
        Vehiculo v2 = new Vehiculo(h2, 2, "GIAN");
        Vehiculo v3 = new Vehiculo(h3, 3, "FACU");
        Vehiculo v4 = new Vehiculo(h4, 4, "AGUS");
        Vehiculo v5 = new Vehiculo(h5, 5, "NICO");
        Vehiculo v6 = new Vehiculo(h5, 5, "NICO");

        Vehiculo v33 = new Vehiculo(h33, 3, "FACU");


        v1.egresaVehiculo(h6, tarifa);
        v2.egresaVehiculo(h6, tarifa);
        v3.egresaVehiculo(h6, tarifa);
        v4.egresaVehiculo(h6, tarifa);
        v5.egresaVehiculo(h6, tarifa);
        v6.egresaVehiculo(h6, tarifa);
        v33.egresaVehiculo(h6, tarifa);


        System.out.println("Se espera false");
        System.out.println(v1.equals(v2));
        System.out.println("Se espera true");
        System.out.println(v5.equals(v6));
        System.out.println("Se espera true");
        System.out.println(v33.equals(v3));

        System.out.println("Se espera true");
        System.out.println(v2.anterior(v3));
        System.out.println("Se espera false");
        System.out.println(v4.anterior(v2));

        System.out.println("Se espera 10");
        System.out.println(v4.obtenerCobrar());

        System.out.println("Se espera true");
        v1.copy(v2);
        System.out.println(v1.equals(v2));
    }
}
