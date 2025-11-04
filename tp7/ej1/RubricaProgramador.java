public class RubricaProgramador extends Rubrica{
    // Atributos de instancia
    protected int lineasCodigo;
    // Constructor
    public RubricaProgramador(int l, int c, int a, int r, int g){
        super(l, c, a, r);
        lineasCodigo = g;
    }
    // Comandos
    public void aumentarLineasCodigo(int p){
        lineasCodigo += p;
    }
    // Consultas
    public int obtenerLineasCodigo(){
        return lineasCodigo;
    }
    public String toString(){
        return super.toString() + lineasCodigo;
    }
    public float productividad(){
        return 1.5f * comunicacion + 3 * autonomia + 5 * responsabilidad + (lineasCodigo/10000);
    }
}
