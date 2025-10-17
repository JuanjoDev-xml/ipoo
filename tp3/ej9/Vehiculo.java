public class Vehiculo {
    // Atributos de instancia
    private Hora ingreso;
    private int aCobrar;
    private int numero;
    private String patente;
    // Constructor
    public Vehiculo(Hora i, int n, String p){
        aCobrar = 0;
        ingreso = establecerIngreso(i);
        numero = n;
        patente = p;
    }
    private Hora establecerIngreso(Hora i){
        if (i.obtenerHora() < 7 || i.obtenerHora() > 22) i.establecerHora(7);
        if (i.obtenerMinutos() < 0 || i.obtenerMinutos() > 59) i.establecerMinutos(0);
        return i;
    }
    // Comandos
    public void egresaVehiculo(Hora c, Tarifa t){
        int diferencia = ingreso.diferenciaMinutos(c);
        if (diferencia <= 15) aCobrar = t.obtenerT15();
        if (diferencia > 15 && diferencia <= 30) aCobrar = t.obtenerT30();
        if (diferencia > 30 && diferencia <= 60) aCobrar = t.obtenerT60();
        if (diferencia > 60) aCobrar = t.obtenerTFija();
    }
    public void copy(Vehiculo v){
        // Requiere v ligado y vehiculo egresado
        ingreso.copy(v.obtenerIngreso());
        numero = v.obtenerNumero();
        patente = v.obtenerPatente();
    }
    // Consultas
    public Hora obtenerIngreso(){
        return ingreso;
    }
    public int obtenerNumero(){
        return numero;
    }
    public String obtenerPatente(){
        return patente;
    }
    public int obtenerCobrar(){
        return aCobrar;
    }
    public boolean equals(Vehiculo v){
        // Requiere v ligado, se implementa en profundidad
        return ingreso.equals(v.obtenerIngreso()) && numero == v.obtenerNumero()
                && patente == v.obtenerPatente();
    }
    public boolean anterior(Vehiculo v){
        // Requiere v ligado
        return ingreso.anterior(v.obtenerIngreso());
    }
}
