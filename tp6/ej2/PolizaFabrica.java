public class PolizaFabrica extends Poliza{
    // Atributos de instancia
    protected int cantOperarios;
    protected float valorEquipo;
    // Constructor
    public PolizaFabrica(int np){
        super(np);
    }
    public PolizaFabrica(int np, float i, float r, int co, float ve){
        super(np, i, r);
        cantOperarios = co;
        valorEquipo = ve;
    }
    // Comandos
    public void establecerCantOperarios(int n){
        cantOperarios = n;
    }
    public void establecervalorEquipo(float n){
        valorEquipo = n;
    }
    // Consultas
    public int obtenerCantOperarios(){
        return cantOperarios;
    }
    public float obtenerValorEquipo(){
        return valorEquipo;
    }
    public float obtenerCostoPoliza(){
        return super.obtenerCostoPoliza() + cantOperarios * 500 + valorEquipo * 0.8f;
    }
}
