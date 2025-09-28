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
        a
    }
    // Consultas
    public Sensor obtenerSensor(int p){
        a
    }
    public boolean posicionValida(int p){
        return p > 0 && p <= cantFila();
    }
    public int cantFila(){
        return fs.length;
    }
    public int cantSensores(){
        a
    }
    public int cantidadRiesgo(){
        a
    }
    public boolean hayNRiesgo(int n){
        a
    }
    public boolean dosConsecutivosEmergencia(){
        a
    }
    public boolean equals(FilaSensores a){
        a
    }
    public FilaSensores clone(){
        a
    }
    public FilaSensores filaCompleta(){
        a
    }
}
