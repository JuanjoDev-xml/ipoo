public class Color{
    // Atributos de instancia
    private int rojo;
    private int verde;
    private int azul;
    // Constructores
    public Color(){
        rojo = 255;
        verde = 255;
        azul = 255;
    }
    // ??????????????????????????????????????????????????????????????????????????????
    public Color(int r, int a, int v){ //está mal el orden en el enunciado? => RGB = red, green, blue
        rojo = determinarValor(r);
        azul = determinarValor(a);
        verde = determinarValor(v);
    }
    // Comandos

    private int determinarValor(int v){
        // Comando auxiliar privado para determinar el valor de cada color en constructor
        int valor;
        if (v >= 0 && v <= 255){
            valor = v;
        }
        else{
            if (v < 0){
                valor = 0;
            }
                else valor = 255;
        }
        return valor;
    }

    public void variar(int val){
        variarRojo(val);
        variarAzul(val);
        variarVerde(val);
    }
    public void variarRojo(int val){
        if (rojo + val < 255 && rojo + val > 0) {
            rojo += val;
        }
        else{
            if (rojo + val < 0) {
                rojo = 0;
            }
            else{
                rojo = 255;
            }
        }
    }
    public void variarAzul(int val){
        if (azul + val < 255 && azul + val > 0) {
            azul += val;
        }
        else{
            if (azul + val < 0) {
                azul = 0;
            }
            else{
                azul = 255;
            }
        }
    }
    public void variarVerde(int val){
        if (verde + val < 255 && verde + val > 0) {
            verde += val;
        }
        else{
            if (verde + val < 0) {
                verde = 0;
            }
            else{
                verde = 255;
            }
        }
    }
    public void establecerRojo(int val){
        rojo = val;
    }
    public void establecerAzul(int val){
        azul = val;
    }
    public void establecerVerde(int val){
        verde = val;
    }
    public void copy(Color c){
        if (c != null) {
            rojo = c.obtenerRojo();
            azul = c.obtenerAzul();
            verde = c.obtenerVerde();
        }
    }
    // Consultas
    public int obtenerRojo(){
        return rojo;
    }
    public int obtenerAzul(){
        return azul;
    }
    public int obtenerVerde(){
        return verde;
    }
    public boolean esRojo(){
        return rojo == 255 && verde == 0 && azul == 0;
    }
    public boolean esGris(){
        return rojo > 0 && rojo < 255 && rojo == verde && verde == azul;
    }
    public boolean esNegro(){
        return rojo == 0 && verde == 0 && azul == 0;
    }
    public Color complemento(){
        return new Color(255 - rojo, 255 - azul, 255 - verde);
    }
    public boolean equals(Color c){
        return c != null && rojo == c.obtenerRojo() && azul == c.obtenerAzul() && verde == c.obtenerVerde();
    }
    public Color clone(){
        return new Color(rojo, azul, verde);
    }
    public String toString(){
        return rojo + " " + azul + " " + verde;
    }
}