public class Punto {
    // Atributos de instancia
    protected float x;
    protected float y;
    // Constructores
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }
    // Comandos
    public void establecerX(float x){
        this.x = x;
    }
    public void establecerY(float y){
        this.y = y;
    }
    public void copy(Punto p){
        // Requiere p ligado
        x = p.obtenerX();
        y = p.obtenerY();
    }
    // Consultas
    public float obtenerX(){
        return x;
    }
    public float obtenerY(){
        return y;
    }
    public boolean equals(Punto p){
        // Requiere p ligado
        return x == p.obtenerX() && y == p.obtenerY();
    }
    public double distancia(Punto p){
        // Requiere p ligado
        return Math.sqrt((x - p.obtenerX())*(x - p.obtenerX()) + (y - p.obtenerY())*(y - p.obtenerY()));
    }
    public Punto clone(){
        return new Punto(x, y);
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
