public class Tester {
    public static void main(String []args){
        Fecha f1 = new Fecha(20, 8, 2025);
        System.out.println(f1.toString());
        f1.establecerAnio(2020);
        f1.establecerMes(3);
        f1.establecerDia(15);
        System.out.println(f1.toString());
        System.out.println(f1.esBisiesto());
        Fecha f2 = new Fecha(16, 3, 2020);
        System.out.println(f1.esAnterior(f2));
        System.out.println(f1.esAnterior(new Fecha(16,4,2019)));
    }
}
