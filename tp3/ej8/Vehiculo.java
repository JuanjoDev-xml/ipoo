public class Vehiculo {
    // Atributos de instancia
    private Hora ingreso;
    private Hora egreso;
    private int numero;
    private String patente;
    // Constructor
    public Vehiculo(Hora i, int n, String p){
        ingreso = establecerIngreso(i);
        numero = n;
        patente = p;
    }
    private Hora establecerIngreso(Hora i){ // está bien? no se aclara qué hacer si la hora no es válida
        if (i.obtenerHora() < 7 || i.obtenerHora() > 22) i.establecerHora(7);
        if (i.obtenerMinutos() < 0 || i.obtenerMinutos() > 59) i.establecerMinutos(0);
        return i;
    }
    // Comandos
    public void egresaVehiculo(Hora c){
        egreso = c;
    }
    public void copy(Vehiculo v){
        // Requiere v ligado y vehiculo egresado
        ingreso.copy(v.obtenerIngreso());
        egreso.copy(v.obtenerEgreso());
        numero = v.obtenerNumero();
        patente = v.obtenerPatente();
    }
    // Consultas
    public Hora obtenerIngreso(){
        return ingreso;
    }
    public Hora obtenerEgreso(){
        return egreso;
    }
    public int obtenerNumero(){
        return numero;
    }
    public String obtenerPatente(){
        return patente;
    }
    public int obtenerCobrar(Tarifa t){
        int res = 0;
        if (egreso != null){
            int diferencia = ingreso.diferenciaMinutos(egreso);
            if (diferencia <= 15) res = t.obtenerT15();
            if (diferencia > 15 && diferencia <= 30) res = t.obtenerT30();
            if (diferencia > 30 && diferencia <= 60) res = t.obtenerT60();
            if (diferencia > 60) res = t.obtenerTFija();
        }
        return res;
    }
    public boolean equals(Vehiculo v){
        // Requiere v ligado, se implementa en profundidad
        return egreso != null && v.obtenerEgreso() != null && // está bien que checkee eso, ya que no lo requiere?
        ingreso.equals(v.obtenerIngreso()) &&
        egreso.equals(v.obtenerEgreso()) && numero == v.obtenerNumero()
        && patente == v.obtenerPatente();
    }
    public boolean anterior(Vehiculo v){
        // Requiere v ligado
        return ingreso.anterior(v.obtenerIngreso());
    }
}
