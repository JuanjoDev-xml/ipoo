public class TesterEquipo
{
    public static void main(String args[]){
    
        //capitan 1
        Jugador c1= new Jugador("Jose");
        c1.establecerNroCamiseta(10);
        c1.establecerPosicion(10);
        c1.establecerGolesConvertidos(4);
        c1.establecerPartidosJugados(3);
        System.out.println("capitan 1:");
        System.out.println(c1.toString());
        //capitan 2
        Jugador c2= new Jugador("Manuel");
        c2.establecerNroCamiseta(10);
        c2.establecerPosicion(10);
        c2.establecerGolesConvertidos(8);
        c2.establecerPartidosJugados(3);
        System.out.println("capitan 2:");
        System.out.println(c2.toString());
        //equipo 1
        Equipo e1= new Equipo("Verdes",c1);
        System.out.println("equipo 1:");
        System.out.println(e1.toString());
        //equipo 2
        Equipo e2= new Equipo("Rojos",c2);
        System.out.println("equipo 2:");
        System.out.println(e2.toString());
        
        //testeo de comandos

        System.out.println("Modificando atributos del equipo 1...");
        e1.incrementarPG(true);
        e1.incrementarPE(false);
        e1.incrementarPP(true);
        e1.aumentarGFavor(2,1);
        e1.aumentarGContra(1);
        System.out.println("Estado de equipo 1 luego de las modificaciones:");
        System.out.println(e1.toString());
        System.out.println("Modificando atributos del equipo 2...");
        e2.incrementarPG(true);
        e2.incrementarPE(false);
        e2.incrementarPP(false);
        e2.aumentarGFavor(3,3);
        e2.aumentarGContra(1);
        System.out.println("Estado de equipo 2 luego de las modificaciones:");
        System.out.println(e2.toString());

        //testeo de consultas

        System.out.println("partidos del equipo 1: "+e1.obtenerPartidos());
        System.out.println("partidos del equipo 2: "+e2.obtenerPartidos());
        System.out.println("puntos del equipo 1: "+e1.obtenerPuntos());
        System.out.println("puntos del equipo 2: "+e2.obtenerPuntos());

        Equipo mejor= e1.mejorPuntaje(e2);
        if(mejor==e1)
          System.out.println("El equipo 1 tiene mejor puntaje");
        else
          System.out.println("El equipo 2 tiene mejor puntaje");

        Jugador c = e1.capitanConMasGoles(e2);
        if (c == c1)
          System.out.println("El capitán con más goles es: " + c1.obtenerNombre());
        else
          System.out.println("El capitán con más goles es: " + c2.obtenerNombre());
          
        System.out.println("los equipos 1 y 2 tienen el mismo estado interno?: "+e1.equals(e2));
        
        
        
    
    }
}