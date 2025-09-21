public class EquipoB {
    // Atributos de instancia
    private String nombre;
    private Jugador jugador;
    private int pG, pE, pP;
    private int gFavor, gContra;
    // Constructor
    public EquipoB(String nom, Jugador cap){
        // Requiere nom y cap ligados
        nombre = nom;
        jugador = cap;
    }
    // Comandos
    public void incrementarPG(boolean jugoElCap){
        pG++;
    }
    public void incrementarPE(boolean jugoElCap){
        pE++;
    }
    public void incrementarPP(boolean jugoElCap){
        pP++;
    }
    public void incrementarGFavor(int total){
        gFavor += total;
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
    public EquipoB mejorPuntaje(EquipoB e){ // Buena práctica/legible???????
        EquipoB mejor = this;
        if (obtenerPuntos() > e.obtenerPuntos()) mejor = this;
        if (obtenerPuntos() < e.obtenerPuntos()) mejor = e;
        if (obtenerPuntos() == e.obtenerPuntos() && gFavor > e.obtenerGFavor()) mejor = this;
        if (obtenerPuntos() == e.obtenerPuntos() && gFavor < e.obtenerGFavor()) mejor = e;
        if (obtenerPuntos() == e.obtenerPuntos() && gFavor == e.obtenerGFavor() && gContra < e.obtenerGContra()) mejor = this;
        if (obtenerPuntos() == e.obtenerPuntos() && gFavor == e.obtenerGFavor() && gContra > e.obtenerGContra()) mejor = e;
        if (obtenerPuntos() == e.obtenerPuntos() && gFavor == e.obtenerGFavor() && gContra == e.obtenerGContra()) mejor = this;
        return mejor;
    }
    public Jugador capitanConMasGoles(EquipoB e){ // está bien ???????????
        Jugador mas;
        if (gFavor >= e.obtenerGFavor()) mas = jugador;
        else mas = e.obtenerCapitan();
        return mas; 
    }
    public String toString(){
        return jugador + " " + pG + " " + pE + " " + pP + " " + gFavor + " " + gContra;
    }
    public boolean equals(EquipoB e){
        // Se implementa superficial
        return e!= null && nombre == e.obtenerNombre() && jugador == e.obtenerCapitan() &&
                pG == e.obtenerPG() && pE == e.obtenerPE() && pP == e.obtenerPP() &&
                gFavor == e.obtenerGFavor() && gContra == e.obtenerGContra();
    }
}
