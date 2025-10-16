public class OtraFilaSensores {
    public class FilaSensores {
    // Atributos de instancia
    private Sensor[] fs;
    // Constructor
    public FilaSensores(int cant){
        // Requiere cant > 0
        fs = new Sensor[cant];
    }
    // Comandos
    public void establecerSensor(int p, Sensor s){
        if (posicionValida(p)) fs[p-1] = s;
    }
    public void intercambiar(int p1, int p2){
        if (posicionValida(p1) && posicionValida(p2)){
            Sensor aux;
            aux = fs[p1-1];
            fs[p1-1] = fs[p2-1];
            fs[p2-1] = aux;
        }
    }
    public void copy(FilaSensores a){
        // Requiere a ligado
        // Requiere las dos filas con el mismo tamaño
        // Requiere que en ambas filas, cada referencia ligada a un sensor
        // Se implementa en profundidad
        for(int i = 0; i < cantFila(); i++){
            fs[i].establecerP1(a.obtenerSensor(i).obtenerP1());
            fs[i].establecerP2(a.obtenerSensor(i).obtenerP2());
        }
    }
    // Consultas
    public Sensor obtenerSensor(int p){
        Sensor res = null;
        if (posicionValida(p)) res = obtenerSensor(p-1);
        return res;
    }
    public boolean posicionValida(int p){
        return p > 0 && p <= cantFila();
    }
    public int cantFila(){
        return fs.length;
    }
    public int cantSensores(){
        int cant = 0;
        for (int i = 0; i < cantFila(); i++){
            if (fs[i] != null) cant++;
        }
        return cant;
    }
    public int cantidadRiesgo(){
        // No requiere todas las referencias del array ligadas
        int cant = 0;
        for (int i = 0; i < cantFila(); i++){
            if (fs[i] != null && fs[i].riesgo()) cant++;
        }
        return cant;
    }
    public boolean hayNRiesgo(int n){
        // No requiere todas las referencias del array ligadas
        int cant = 0;
        boolean hay = false;
        for (int i = 0; i < cantFila() && !false; i++){
            if (fs[i] != null && fs[i].riesgo()) cant++;
            if (cant >= n) hay = true;
        }
        return hay;
    }
    public boolean dosConsecutivosEmergencia(){
        // No requiere todas las referencias del array ligadas
        int cantConsec = 0;
        boolean hayDosConsec = false;
        for (int i = 0; i < cantFila() && !hayDosConsec; i++){
            if (fs[i] != null && (fs[i]).emergencia()) cantConsec++;
            else cantConsec = 0;
            if (cantConsec >= 2) hayDosConsec = true;
        }
        return hayDosConsec;
    }
    public boolean equals(FilaSensores a){
        // No requiere a ligado
        // Se implementa superficial
        boolean iguales = a != null && cantFila() == a.cantFila();
        for (int i = 0; i < cantFila() && iguales; i++){
            if (fs[i] != a.obtenerSensor(i)) iguales = false;
        }
        return iguales;
    }
    public FilaSensores clone(){
        // No requiere todas las referencias del array ligadas
        // Se implementa en profundidad
        FilaSensores res = new FilaSensores(cantFila());
        for (int i = 0; i < cantFila(); i++){
            if (fs[i] != null){
                (res.obtenerSensor(i)).establecerP1(fs[i].obtenerP1());
                (res.obtenerSensor(i)).establecerP2(fs[i].obtenerP2());
            }
            else res.establecerSensor(i, null);
        }
        return res;
    }
    public FilaSensores filaCompleta(){ // Está bien?
        int pos = 0;
        FilaSensores completa = new FilaSensores(cantFila());
        // Poner los sensores en las primeras posiciones del nuevo arreglo
        for (int i = 0; i < cantFila() && completa.cantSensores() < cantSensores(); i++){
            if (fs[i] != null){
                completa.establecerSensor(pos, fs[i]);
                pos++;
            }
        }
        // Rellenar el nuevo arreglo con referencias vacías
        for (int i = pos; i < cantFila(); i++){
            completa.establecerSensor(pos, null);
            pos++;
        }
        return completa;
    }
}
}
