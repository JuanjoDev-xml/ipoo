public class Dispositivo{
    // Atributos de clase
    protected static float max = 0.01f;
    // Atributos de instancia
    protected float p1;
    protected float p2;
    // Constructor
    public Dispositivo(float pU, float pD){
        pU = p1;
        pD = p2;
    }
    // Comandos
    public void establecerP1(float p){
        p1 = p;
    }
    public void establecerP2(float p){
        p1 = p;
    }
    public void copy(Dispositivo s){
        if (s != null){
            p1 = s.obtenerP1();
            p2 = s.obtenerP2();
        }
    }
    // Consultas
    public float obtenerP1(){
        return p1;
    }
    public float obtenerP2(){
        return p2;
    }
    public boolean riesgo(){
        return p2 > p1;
    }
    public boolean emergencia(){
        return p1 < max;
    }
    public boolean equals(Dispositivo d){
        return d != null && p1 == d.obtenerP1() && p2 == d.obtenerP2();
    }
    public Dispositivo clone(){
        return new Dispositivo(p1, p2);
    }
}