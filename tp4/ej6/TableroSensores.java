public class TableroSensores{
    // Atributos de instancia
    private Sensor[][] grilla;
    // Constructor
    public TableroSensores(int cantFil, int cantCol){
        // Requiere cantFil, cantCol > 0
        grilla = new Sensor[cantFil][cantCol];
    }
    // Comandos
    public void establecerSensor(int f, int c, Sensor s){
        // Requiere 0 <= f < cantFilas(), 0 <= c < cantColumnas()
        grilla[f][c] = s;
    }
    public void intercambiar(int f1, int f2){
        // Requiere 1 <= f1,f2 < cantFilas()
        Sensor aux;
        for (int i = 0; i < cantColumnas(); i++){
            aux = grilla[f1][i];
            grilla[f1][i] = grilla[f2][i];
            grilla[f2][i] = aux;
        }
    }
    public void copy(TableroSensores t){
        // Se implementa superficial
        if (t != null && cantFilas() == t.cantFilas() && cantColumnas() == t.cantColumnas()){
            for (int i = 0; i < cantFilas(); i++){
                for (int j = 0; j < cantColumnas(); j++){
                    grilla[i][j] = t.obtenerSensor(i, j);
                }
            }
        }
    }
    // Consultas
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public Sensor obtenerSensor(int f, int c){
        // Requiere 0 <= f < cantFilas() y 0 <= c < cantColumnas()
        return grilla[f][c];
    }
    public int cantidadFilasRiesgo(){
        int cant = 0;
        boolean tiene = false;
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas() && !tiene; j++){
                if (grilla[i][j] != null && grilla[i][j].riesgo()){
                    cant++;
                    tiene = true;
                }
            }
            tiene = false;
        }
        return cant;
    }
    public boolean todosEnEmergencia(){
        boolean todos = true;
        for (int i = 0; i < cantFilas() && todos; i++){
            for (int j = 0; j < cantColumnas() && todos; j++){
                if (grilla[i][j] == null || !(grilla[i][j].riesgo())) todos = false;
            }
        }
        return todos;
    }
    public boolean hayNRiesgoCol(int c, int n){
        // Requiere 0 <= c < cantColumnas()
        boolean res = false;
        int cantRiesgo = 0;
        if (n <= cantFilas()){
            for (int i = 0; i < cantFilas() && cantRiesgo <= n; i++){
                if (grilla[i][c] != null && grilla[i][c].riesgo())
                    cantRiesgo++;
            }
            res = cantRiesgo <= n;
        }
        return res;
    }
    public boolean dosConsecutivosEmergenciaFila(int f){
        // Requiere 0 <= f < cantFilas()
        int cantConsec = 0;
        for (int i = 0; i < cantFilas() && cantConsec < 2; i++){
            if (grilla[f][i] != null && grilla[f][i].riesgo()) cantConsec++;
            else cantConsec = 0;
        }
        return cantConsec >= 2;
    }

    private int menorCant(int c1, int c2){ // Método privado para contarCoincidencias
        int res = c2;
        if (c1 < c2) res = c1;
        return res;
    }
    public int contarCoincidencias(TableroSensores gs){
        int cantCoinci = 0;
        int menorCantFilas = menorCant(cantFilas(), gs.cantFilas());
        int menorCantColumnas = menorCant(cantColumnas(), gs.cantColumnas());
        if (gs != null){
            for (int i = 0; i < menorCantFilas; i++){
                for (int j = 0; j < menorCantColumnas; j++){
                    if (grilla[i][j] != null && gs.obtenerSensor(i,j) != null &&
                        grilla[i][j].equals(gs.obtenerSensor(i, j))) cantCoinci++;
                }
            }
        }
        return cantCoinci;
    }
    public boolean equals(TableroSensores t){
        // Se implementa en profundidad
        boolean iguales = t != null && cantFilas() == t.cantFilas() &&
                            cantColumnas() == t.cantColumnas();
        for (int i = 0; i < cantFilas() && iguales; i++){
            for (int j = 0; j < cantColumnas() && iguales; j++){
                if ( !(grilla[i][j].equals(t.obtenerSensor(i, j))) ) iguales = false;
            }
        }
        return iguales;
    }
    public TableroSensores clone(){
        // Se implementa en profundidad
        // Requiere todas las referencias de la grilla ligadas
        TableroSensores clon = new TableroSensores(cantFilas(), cantColumnas());
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                clon.establecerSensor(i, j, grilla[i][j].clone());
            }
        }
        return clon;
    }
}