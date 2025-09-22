public class Tarifa {
    // Atributos de instancia
    private int t15, t30, t60, tFija;
    // Constructor
    public Tarifa(int t1, int t2, int t3, int tfija){
        t15 = t1;
        t30 = t2;
        t60 = t3;
        tFija = tfija;
    }
    // Consultas
    public int obtenerT15(){
        return t15;
    }
    public int obtenerT30(){
        return t30;
    }
    public int obtenerT60(){
        return t60;
    }
    public int obtenerTFija(){
        return tFija;
    }
}
