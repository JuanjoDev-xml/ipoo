public class Jugador{
    // Atributos de instancia
    private String nombre;
    private int nroCamiseta;
    private int posicion;
    private int golesConvertidos;
    private int partidosJugados;
    // Constructor
    public Jugador(String nom){
        nombre = nom;
    }
    // Comandos
    public void establecerNroCamiseta(int n){
        nroCamiseta = n;
    }
    public void establecerPosicion(int n){
        posicion = n;
    }
    public void establecerGolesConvertidos(int n){
        golesConvertidos = n;
    }
    public void establecerPartidosJugados(int n){
        partidosJugados = n;
    }
    public void aumentarGoles(int n){
        golesConvertidos += n;
    }
    public void aumentarUnPartido(){
        partidosJugados++;
    }
    // Consultas
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNroCamiseta(){
        return nroCamiseta;
    }
    public int obtenerPoiscion(){
        return posicion;
    }
    public int obtenerGolesConvertidos(){
        return golesConvertidos;
    }
    public int obtenerPartidosJugados(){
        return partidosJugados;
    }
    public int promedioGolesXPart(){
        int promedio;
        if (partidosJugados > 0) {
            promedio = golesConvertidos/partidosJugados;
        }
        else{
            promedio = 0;
        }
        return promedio;
    }
    public boolean masGoles(Jugador j){
        return golesConvertidos > j.obtenerGolesConvertidos();
    }
    public Jugador jugConMasGoles(Jugador j){
        // Requiere f ligada
        Jugador jugMasGoles;
        if (golesConvertidos > j.obtenerGolesConvertidos()){
            jugMasGoles = this;
        }
        else{
            jugMasGoles = j;
        }
        return jugMasGoles;
    }
    public String toString(){
        return nombre + " " + nroCamiseta + " " + posicion + " " + golesConvertidos + " " + partidosJugados;
    }
    public Jugador clone(){
        Jugador c = new Jugador(nombre);
        c.establecerNroCamiseta(nroCamiseta);
        c.establecerPosicion(posicion);
        c.establecerGolesConvertidos(golesConvertidos);
        c.establecerPartidosJugados(partidosJugados);
        return c;
    }
    public boolean equals(Jugador j){
        // Requiere f ligada
        return nombre == j.obtenerNombre() && nroCamiseta == j.obtenerNroCamiseta() && posicion == j.obtenerPoiscion()
                && golesConvertidos == j.obtenerGolesConvertidos() && partidosJugados == j.obtenerPartidosJugados();
    }
}