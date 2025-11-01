public class PromocionPymes extends PlanBase {
    // Atributos de instancia
    protected boolean activa;
    // Constructor
    public PromocionPymes(int u, int b){
        super(u, b);
        activa = true;
    }
    // Comandos
    public void cambiarActiva(){
        activa = !activa;
    }
    // Consultas
    public boolean estaActiva(){
        return activa;
    }
    public int costoPlan(){
        int res = base + usuarios * 5;
        if (activa) res = base;
        return res;
    }
}
