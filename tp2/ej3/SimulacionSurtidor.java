import java.util.Scanner;
public class SimulacionSurtidor {
    public static void main(String[] args){
        Surtidor s = new Surtidor();
        System.out.println("Ingrese la cantidad de iteraciones:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(s.obtenerLitrosGasoil() + " " + s.obtenerLitrosSuper() + " " + s.obtenerLitrosPremium());
            System.out.println("Ingrese un entero entre 1 y 6:");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese litros a cargar de Gasoil");
                    s.extraerGasoil(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese litros a cargar de Super");
                    s.extraerSuper(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese litros a cargar de Premium");
                    s.extraerPremium(scanner.nextInt());
                    break;
                case 4:
                    s.llenarDepositoGasoil();
                    break;
                case 5:
                    s.llenarDepositoSuper();
                    break;
                case 6:
                    s.llenarDepositoPremium();
                    break;
            }
        }
        scanner.close();
    }
}
