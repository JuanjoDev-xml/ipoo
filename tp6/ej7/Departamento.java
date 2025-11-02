public class Departamento extends Alojamiento{
    // Atributos de instancia
    protected int ambientes;
    protected boolean balcon;
    // Constructor
    public Departamento(int id, int p, int a, boolean b){
        super(id, p);
        ambientes = a;
        balcon = b;
    }
    // Consultas
    public boolean tieneBalcon(){
        return balcon;
    }
    public float costoDiario(int p){
        float res = ambientes * p;
        if (tieneBalcon()) res += 150;
        return res;
    }
}
