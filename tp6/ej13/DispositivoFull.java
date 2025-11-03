public class DispositivoFull extends Dispositivo{
    // Atributos de instancia
    protected float p3;
    protected float p4;
    // Constructor
    public DispositivoFull(float pU, float pD, float pT, float pC){
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
        return p2 > p1 || p4 > p3;
    }
    public boolean emergencia(){
        return p4 < max;
    }
    public boolean equals(Dispositivo d){
        boolean iguales = d != null;
        if (iguales){
            if (this != d && getClass() != d.getClass()){
                iguales = false;
            }
            else{
                DispositivoFull f = (DispositivoFull) d;
                iguales = super.equals(f) && p3 == f.obtenerP3() && p4 == f.obtenerP4();
            }
        }
        return iguales;
    }
    public DispositivoFull clone(){
        return new DispositivoFull(p1, p2, p3, p4);
    }
}
