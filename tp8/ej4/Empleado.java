public class Empleado extends Elemento{
    // Atributos de instancia
    protected int legajo;
    protected String nombre;
    protected int cantHoras;
    protected float valorHora;
    // Constructor
    public Empleado(int leg, String nombre, int canth, float valorh){
        legajo = leg;
        this.nombre = nombre;
        cantHoras = canth;
        valorHora = valorh;
    }
    // Consultas
    public int obtenerLegajo(){
        return legajo;
    }
    public float obtenerSueldo(){
        return cantHoras * valorHora;
    }
    public int obtenerCantHoras(){
        return cantHoras;
    }
    public float obtenerValorHoras(){
        return valorHora;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public boolean esEquivalente(Elemento e){
        // Requiere e de clase empleado
        Empleado em = (Empleado) e;
        return legajo == em.obtenerLegajo();
    }
    public boolean esMayor(Elemento e){
        // Requiere e de clase empleado
        Empleado em = (Empleado) e;
        return legajo > em.obtenerLegajo();
    }
}
