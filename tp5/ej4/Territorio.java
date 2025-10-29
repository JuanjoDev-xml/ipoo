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
}
