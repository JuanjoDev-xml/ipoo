public class Borde {
    // Atributos de instancia
    private int grosor;
    private Color color;
    // Constructor
    Borde(int g, Color c){
        grosor = g;
        color = c;
    }
    // Comandos
    public void establecerGrosor(int g){
        grosor = g;
    }
    public void establecerColor(Color c){
        color = c;
    }
    public void copy(Borde b){
        // Requiere b ligada
        grosor = b.obtenerGrosor();
        color = b.obtenerColor();
    }
    // Consultas
    public int obtenerGrosor(){
        return grosor;
    }
    public Color obtenerColor(){
        return color;
    }
    public Borde clone(){
        return new Borde(grosor, color);
    }
    public boolean equals(Borde b){
        // Requiere b ligada
        return grosor == b.obtenerGrosor() && color == b.obtenerColor();
    }
    public String toString(){
        return "Grosor: " + grosor + "Color (objeto): " + color;
    }
}
