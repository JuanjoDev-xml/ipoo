public class Alumno extends Elemento{
    // Atributos de instancia
    protected int nroIngreso;
    protected String nombre;
    protected float promedio;
    // Constructor
    public Alumno(int l, String n, float p){
        nroIngreso = l;
        nombre = n;
        promedio = p;
    }
    // Consultas
    public int obtenerNroIngreso(){
        return nroIngreso;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public float obtenerPromedio(){
        return promedio;
    }
    public boolean esEquivalente(Elemento e){
        // Requiere e de clase Alumno
        boolean iguales = e != null;
        if (iguales && e != this){
            Alumno a = (Alumno) e;
            iguales = nroIngreso == a.obtenerNroIngreso() && nombre.equals(a.obtenerNombre()) && promedio == a.obtenerPromedio();
        }
        return iguales;
    }
    public boolean esMayor(Elemento e){
        // Requiere e de clase alumno
        boolean mayor = e != null;
        if (mayor){
            Alumno a = (Alumno) e;
            mayor = nroIngreso > a.obtenerNroIngreso();
        }
        return mayor;
    }
}
