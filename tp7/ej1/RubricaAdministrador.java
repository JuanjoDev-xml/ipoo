public class RubricaAdministrador extends RubricaLider{
    // Atributos de instancia
    protected int proyectos;
    // Constructor
    public RubricaAdministrador(int l, int c, int a, int r, int go, int ga, int p){
        super(l, c, a, r, go, ga);
        proyectos = p;
    }
    // Comandos
    public void aumentarProyectos(){
        proyectos++;
    }
    // Consultas
    public int obtenerProyectos(){
        return proyectos;
    }
    public String toString(){
        return super.toString() + proyectos;
    }
    public float productividad(){
        return 4 * promedio() + 10 * proyectos;
    }
}
