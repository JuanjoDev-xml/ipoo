public class Rubrica{
    // Atributos de instancia
    protected int legajo;
    protected int comunicacion;
    protected int autonomia;
    protected int responsabilidad;
    // Constructor
    public Rubrica(int l, int c, int a, int r){
        legajo = l;
        comunicacion = c;
        autonomia = a;
        responsabilidad = r;
    }
    // Comandos
    public void establecerComunicacion(int p){
        comunicacion = p;
    }
    public void establecerAutonomia(int p){
        autonomia = p;
    }
    public void establecerResponsabilidad(int p){
        responsabilidad = p;
    }
    // Consultas
    public int obtenerLegajo(){
        return legajo;
    }
    public int obtenerComunicacion(){
        return comunicacion;
    }
    public int obtenerAutonomia(){
        return autonomia;
    }
    public int obtenerRespoonsabilidad(){
        return responsabilidad;
    }
    public String toString(){
        return legajo + " " + comunicacion + " " + autonomia + " " + responsabilidad;
    }
    public int total(){
        return comunicacion + autonomia + responsabilidad;
    }
    public float promedio(){
        return total()/3f;
    }
    public float productividad(){
        return 2 * comunicacion + 3 * autonomia + 5 * responsabilidad;
    }
}