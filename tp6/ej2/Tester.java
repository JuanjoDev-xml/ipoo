public class Tester {
    public static void main(String args[]){
        // Inciso b
        Poliza p1, p2, p3;
        p1 = new Poliza(111, 100, 120);
        p2 = new PolizaEscolar(112, 100, 120, 1000, 1500);
        p3 = new PolizaFabrica(113, 100, 120, 20, 50000);
        System.out.println(" ");
        System.out.println(p1.obtenerNroPoliza() + " " + p1.obtenerCostoPoliza());
        System.out.println(p2.obtenerNroPoliza() + " " + p2.obtenerCostoPoliza());
        System.out.println(p3.obtenerNroPoliza() + " " + p3.obtenerCostoPoliza());

        // Inciso c
        PolizaEscolar p4;
        Poliza p5;
        p4 = new PolizaEscolar(114, 100, 120, 1000, 1500);
        p5 = new PolizaEscolar(115, 100, 120, 1000, 1500);
        System.out.println(p4.obtenerNroPoliza() + " " + p4.obtenerCostoPoliza(2));
        System.out.println(p5.obtenerNroPoliza() + " "); // + p5.obtenerCostoPoliza(2)) -> error
        // p5 es de tipo estático Poliza, y Poliza no tiene definido ese método con parámetro
    }
}
