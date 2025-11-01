public class PlanBase{
    // Atributos de instancoa
    protected int usuarios;
    protected int base;
    // Constructor
    public PlanBase(int u, int b){
        usuarios = u;
        base = b;
    }
    // Consultas
    public int obtenerUsusarios(){
        return usuarios;
    }
    public int obtenerBase(){
        return base;
    }
    public int costoPlan(){
        return base * 2 + usuarios * 10;
    }
}