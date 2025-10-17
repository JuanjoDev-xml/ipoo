public class Hora {
    // Atributos de instancia
    private int hor;
    private int min;
    // Constructor
    public Hora(int h, int m){
        hor = h;
        min = m;
    }
    // Comandos
    public void establecerHora(int c){
        hor = c;
    }
    public void establecerMinutos(int c){
        min = c;
    }
    public void copy(Hora h){
        if (h != null){
            hor = h.obtenerHora();
            min = h.obtenerMinutos();
        }
    }
    // Consultas
    public int obtenerHora(){
        return hor;
    }
    public int obtenerMinutos(){
        return min;
    }
    public boolean equals(Hora c){
        // Requiere c ligado
        return hor == c.obtenerHora() && min == c.obtenerMinutos();
    }
    public int diferenciaMinutos(Hora c){
        int res = 0;
        if (c != null){
            int minLocal = 60*hor + min;
            int minC = 60*(c.obtenerHora()) + c.obtenerMinutos();
            res = minLocal - minC;
            if (res < 0) res = res*(-1); // para tener el valor absoluto
        }
        return res;
    }
    private boolean horaAnterior(Hora h){
        return hor < h.obtenerHora() || (hor == h.obtenerHora() && min < h.obtenerMinutos()); 
    }
    public boolean anterior(Hora c){
        return c != null && horaAnterior(c);
    }
}
