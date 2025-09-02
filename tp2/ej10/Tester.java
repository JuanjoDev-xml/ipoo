public class Tester {
    public static void main(String[] args) {
        Jugador  j1 = new Jugador("juansito");
        System.out.println(j1.toString());
        j1.establecerGolesConvertidos(3);
        j1.aumentarGoles(3);
        j1.establecerPartidosJugados(2);
        j1.aumentarUnPartido();
        j1.establecerPosicion(5);
        j1.establecerNroCamiseta(10);
        System.out.println(j1.toString());
        Jugador j2 = j1.clone();
        System.out.println(j2.equals(j1));
    }
}
