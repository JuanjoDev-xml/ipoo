public class Territorio {
    // Atributos de instancia
    protected Refugio[][] tablero;
    // Constructor
    public Territorio(int nf, int nc){
        // Requiere nf y nc mayores a 0
        tablero = new Refugio[nf][nc];
    }
    // Comandos
    public boolean establecerRefugio(Refugio r, int f, int c){
        tablero[f][c] = r;
        return 0 <= f && f < cantFilas() && 0 <= c && c < cantColumnas();
    }
    // Consultas
    public int cantFilas(){
        return tablero.length;
    }
    public int cantColumnas(){
        return tablero[0].length;
    }
    public int cantRefugios(){
        int cant = 0;
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                if (tablero[i][j] != null) cant++;
            }
        }
        return cant;
    }
    public int filaMasPoblada(){
        int cant = 0;
        int max = 0;
        int filaMax = 0;
        for (int i = 0; i < cantFilas() && cant < cantColumnas(); i++){
            cant = 0;
            for (int j = 0; j < cantColumnas(); j++){
                if (tablero[i][j] != null) cant++;
            }
            if (cant > max){
                max = cant;
                filaMax = i;
            }
        }
        return filaMax;
    }
    public boolean maximoNRefugiosHabitables(int f, int n){
        int cant = 0;
        for (int j = 0; j < cantColumnas() && cant <= n; j++){
            if (tablero[f][j] != null && tablero[f][j].esHabitable()) cant++;
        }
        return cant == n;
    }
    public int cantConDisponibilidadMayor(int m){
        int cant = 0;
        boolean tiene = false;
        for (int j  = 0; j < cantColumnas(); j++){
            tiene = false;
            for (int i = 0; i < cantFilas() && !tiene; i++){
                if (tablero[i][j] != null && tablero[i][j].disponibilidad() > m){
                    tiene = true;
                    cant++;
                }
            }
        }
        return cant;
    }
    public ColeccionRefugios coleccionFila(){
        ColeccionRefugios coleccion = new ColeccionRefugios(cantColumnas());
        boolean pude = false;
        for (int i = 0; i < cantFilas(); i++){
            pude = false;
            for (int j = 0; j < cantColumnas() && !pude; j++){
                if (tablero[i][j] != null){
                    coleccion.insertarRefugio(tablero[i][j]);
                    pude = true;
                }
            }
        }
        return coleccion;
    }
    public Territorio clone(){
        // Profundidad
        Territorio clon = new Territorio(cantFilas(), cantColumnas());
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                if (tablero[i][j] != null){
                    clon.establecerRefugio(tablero[i][j].clone(), i, j);
                }
                else clon.establecerRefugio(null, i, j);
            }
        }
        return clon;
    }
}
