public class Equipo {
    // Atributos de instancia
    private String nombre;
    private Jugador jugador;
    private int pG, pE, pP;
    private int gFavor, gContra;
    // Constructor
    public Equipo(String nom, Jugador cap){
        // Requiere nom y cap ligados
        nombre = nom;
        jugador = cap;
    }
    // Comandos
    public void incrementarPG(boolean jugoElCap){
        pG++;
        if (jugoElCap) jugador.aumentarUnPartido();
    }
    public void incrementarPE(boolean jugoElCap){
        pE++;
        if (jugoElCap) jugador.aumentarUnPartido();
    }
    public void incrementarPP(boolean jugoElCap){
        pP++;
        if (jugoElCap) jugador.aumentarUnPartido();
    }
    public void aumentarGFavor(int total, int delCap){
        gFavor += total;
        if (delCap > 0) jugador.aumentarGoles(delCap);
    }
    public void aumentarGContra(int total){
        gContra += total;
    }
    // Consultas
    public String obtenerNombre(){
        return nombre;
    }
    public Jugador obtenerCapitan(){
        return jugador;
    }
    public int obtenerPG(){
        return pG;
    }
    public int obtenerPE(){
        return pE;
    }
    public int obtenerPP(){
        return pP;
    }
    public int obtenerGFavor(){
        return gFavor;
    }
    public int obtenerGContra(){
        return gContra;
    }
    public int obtenerPartidos(){
        return pG + pE + pP;
    }
    public int obtenerPuntos(){
        return 3*pG + pE;
    }
    public Equipo mejorPuntaje(Equipo e){
        Equipo mejor = this;
        if (obtenerPuntos() > e.obtenerPuntos()) mejor = this;
        else if (obtenerPuntos() < e.obtenerPuntos()) mejor = e;
        else if (obtenerPuntos() == e.obtenerPuntos() && gFavor > e.obtenerGFavor()) mejor = this;
        else if (obtenerPuntos() == e.obtenerPuntos() && gFavor < e.obtenerGFavor()) mejor = e;
        else if (obtenerPuntos() == e.obtenerPuntos() && gFavor == e.obtenerGFavor() && gContra < e.obtenerGContra()) mejor = this;
        else if (obtenerPuntos() == e.obtenerPuntos() && gFavor == e.obtenerGFavor() && gContra > e.obtenerGContra()) mejor = e;
        else if (obtenerPuntos() == e.obtenerPuntos() && gFavor == e.obtenerGFavor() && gContra == e.obtenerGContra()) mejor = this;
        return mejor;
    }
    public Jugador capitanConMasGoles(Equipo e){
        Jugador mas;
        if (gFavor >= e.obtenerGFavor()) mas = jugador;
        else mas = e.obtenerCapitan();
        return mas; 
    }
    public String toString(){
        return jugador + " " + pG + " " + pE + " " + pP + " " + gFavor + " " + gContra;
    }
    public boolean equals(Equipo e){
        // Requiere e ligado, se implementa se profundidad
        return nombre == e.obtenerNombre() && jugador.equals(e.obtenerCapitan()) &&
                pG == e.obtenerPG() && pE == e.obtenerPE() && pP == e.obtenerPP() &&
                gFavor == e.obtenerGFavor() && gContra == e.obtenerGContra();
    }
}
