public class Sensor{
    // Atributos de clase
    private static float max = 0.01f;
    // Atributos de instancia
    private float p1;
    private float p2;
    // Constructor
    public Sensor(float p1, float p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    // Comandos
    public void establecerP1(float p){
        p1 = p;
    }
    public void establecerP2(float p){
        p1 = p;
    }
    public void copy(Sensor s){
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
    public boolean equals(Sensor s){
        return s != null && p1 == s.obtenerP1() && p2 == s.obtenerP2();
    }
    public Sensor clone(){
        return new Sensor(p1, p2);
    }
}