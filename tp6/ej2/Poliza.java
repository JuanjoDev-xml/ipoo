public class Poliza{
    //Atributos de instancia
    protected int nroPoliza;
    protected float incendio;
    protected float robo;
    protected boolean activa;
    // Constructor
    public Poliza(int np){
        nroPoliza = np;
        activa = true;
    }
    public Poliza(int np, float i, float r){
        nroPoliza = np;
        incendio = i;
        robo = r;
        activa = true;
    }
    //Comandos
    public void establecerIncendio(float m){
        incendio = m;
    }
    public void establecerRobo(float m){
        robo = m;
    }
    public void actualizarPorcentaje(int p){
        if (activa){
            incendio += (incendio*p)/100;
            robo += (robo*p)/100;
        }
    }
    public void activar(){
        activa = true;
    }
    public void desactivar(){
        activa = false;
    }
    //Consultas
    public int obtenerNroPoliza(){
        return nroPoliza;
    }
    public float obtenerIncendio(){
        return incendio;
    }
    public float obtenerRobo(){
        return robo;
    }
    public float obtenerCostoPoliza(){
        return incendio + robo;
    }
    public boolean estaActiva(){
        return activa;
    }
}