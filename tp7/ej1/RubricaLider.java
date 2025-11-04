public class RubricaLider extends Rubrica{
    // Atributos de instancia
    protected int gestionConflictos;
    protected int gestionCambios;
    // Constructor
    public RubricaLider(int l, int c, int a, int r, int go, int ga){
        super(l, c, a, r);
        gestionConflictos = go;
        gestionCambios = ga;
    }
    // Comandos
    public void establecerConflictos(int p){
        gestionConflictos = p;
    }
    public void establecerCanbios(int p){
        gestionCambios = p;
    }
    // Consultas
    public int obtenerConflictos(){
        return gestionConflictos;
    }
    public int obtenerCambios(){
        return gestionCambios;
    }
    public String toString(){
        return super.toString() + gestionConflictos + gestionCambios;
    }
    public int total(){
        return super.total() + gestionConflictos + gestionCambios;
    }
    public float promedio(){
        return total()/5;
    }
}
