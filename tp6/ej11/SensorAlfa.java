public class SensorAlfa extends Sensor{
    // Atributos de instancia
    protected float p3;
    protected float p4;
    // Constructor
    public SensorAlfa(float pU, float pD, float pT, float pC){
        super(pU, pD);
        p3 = pT;
        p4 = pC;
    }
    // Comandos
    public void establecerP3(float p){
        p3 = p;
    }
    public void establecerP4(float p){
        p4 = p;
    }
    // Consultas
    public float obtenerP3(){
        return p3;
    }
    public float obtenerP4(){
        return p4;
    }
    public boolean riesgo(){
        return super.riesgo() || p4 > p3;
    }
    public boolean emergencia(){
        return p4 < max;
    }
    public SensorAlfa clone(){
        return new SensorAlfa(p1, p2, p3, p4);
    }
}
