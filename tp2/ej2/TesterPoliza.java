import java.util.Scanner;
public class TesterPoliza {
    public static void main(String[]args){
        /*
        // Inciso b
        
        System.out.println("Ingrese num, incendio y robo:");
        Scanner scanner = new Scanner(System.in);
        int num;
        float incend, robo;
        do {
            num = scanner.nextInt();
            incend = scanner.nextFloat();
            robo = scanner.nextFloat();
        } while (num < 0 || incend < 0 || robo < 0);
        scanner.close();
        Poliza p1 = new Poliza(num, incend, robo);
        p1.actualizarPorcentaje(20);
        p1.desactivar();
        p1.actualizarPorcentaje(10);
        p1.activar();
        System.out.println(p1.obtenerNroPoliza() + " " + p1.obtenerCostoPoliza() + " " + p1.estaActiva());
        */
        // inciso c
        Poliza p1 = new Poliza(111);
        p1.establecerRobo(1000);
        p1.establecerIncendio(1200);
        p1.actualizarPorcentaje(15);
        System.out.println(p1.obtenerNroPoliza() + " " + p1.obtenerCostoPoliza());
    }
}
