public class Refugio{
    // Atributos de clase
    protected static final int capacidadAlacena = 20;
    protected static final int cantidadCamas = 10;
    // Atributos de instancia
    protected int alimentos, bebidas, camas;
    // Constructor
    public Refugio(int a, int b, int c){
        if ((a + b) > capacidadAlacena){
            alimentos = capacidadAlacena/2;
            bebidas = capacidadAlacena/2;
        }
        else{
            alimentos = a;
            bebidas = b;
        }
        if(c > cantidadCamas){
            camas = cantidadCamas;
        }
        else{
            camas = c;
        }
    }
    // Comandos
    public void consumirAlimento(){
        // Requiere controlar que haya alimento
        alimentos--;
    }
    public void consumirBebida(){
        // Requiere controlar que haya bebida
        bebidas--;
    }
    public boolean ocuparCama(){
        boolean res;
        if (camas < cantidadCamas){
            camas++;
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
    public boolean desocuparCama(){
        boolean res;
        if (camas != 0){
            camas--;
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
    public boolean reponerAlimentos(int n){
        boolean res;
        if (n > 0 && n <= capacidadAlacena - alimentos - bebidas){
            alimentos += n;
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
    public boolean reponerBebidas(int n){
        boolean res;
        if (n > 0 && n <= capacidadAlacena - alimentos - bebidas){
            bebidas += n;
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
    // Consultas
    public int obtenerAlimentos(){
        return alimentos;
    }
    public int obtenerBebidas(){
        return bebidas;
    }
    public int obtenerCamas(){
        return camas;
    }
    public int obtenerCapacidadAlacena(){
        return capacidadAlacena;
    }
    public boolean esHabitable(){
        return alimentos > 0 || bebidas > 0 || camas < cantidadCamas;
    }
    public int disponibilidad(){
        return cantidadCamas - camas;
    }
    public int diasSupervivencia(){
        int res;
        if (alimentos < bebidas){
            res = alimentos;
        }
        else{
            res = bebidas;
        }
        return res;
    }
    public boolean mayorAlimentos(Refugio r){
        boolean res;
        if (r != null && alimentos > r.obtenerAlimentos()){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
    public boolean equals(Refugio r){
        return r != null && r.obtenerAlimentos() == alimentos && r.obtenerBebidas() == bebidas
                         && r.obtenerCamas() == camas;
    }
    public Refugio clone(){
        return new Refugio(alimentos, bebidas, camas);
    }
    public String toString(){
        return alimentos + " " + bebidas + " " + camas;
    }
}
