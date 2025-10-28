public class Historicos{
    // Atributos de instancia
    private Jugador[] jugadoresHistoricos;
    private int cant;
    // Constructor
    public Historicos(int n){
        // Requiere n mayor a 0
        jugadoresHistoricos = new Jugador[n];
        cant = 0;
    }
    // Comandos
    public void establecerJugador(Jugador j){
        // Requiere que la colección no esté llena y j ligada
        jugadoresHistoricos[cant] = j;
        cant++;
    }
    public void ordenar(){
        // Buble sort
    }
    // Consultas
    public boolean estaLlena(){
        return cant == jugadoresHistoricos.length;
    }
    public int cantPosiciones(){
        return jugadoresHistoricos.length;
    }
    public int cantJugadores(){
        return cant;
    }
    public Jugador obtenerJugador(int p){
        // Requiere p válida
        return jugadoresHistoricos[p];
    }
    public boolean mMayores(int g, int m){
        int cant = 0;
        for (int i = 0; i < cantJugadores() && cant <= m; i++){
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g) cant++;
        }
        return cant == m;
    }
    public boolean alMenosMMayores(int g, int m){
        int cant = 0;
        for (int i = 0; i < cantJugadores() && cant < m; i++){
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g) cant++;
        }
        return cant >= m;
    }
    public Historicos goleadores(int g){
        Historicos nueva = new Historicos(cantJugadores());
        for (int i = 0; i < cantJugadores(); i++){
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g){
                nueva.establecerJugador(obtenerJugador(i));
            }
        }
        return nueva;
    }
}