public class Triangulo extends Figura{
    // Atributos de instancia
    protected Punto v1, v2, v3;
    // Constructor
    public Triangulo(Punto p1, Punto p2, Punto p3){
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }
    // Consultas
    public double area(){
        double a = v1.distancia(v2);
        double b = v1.distancia(v3);
        double c = v2.distancia(v3);
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s - a)*(s - b)* (s - c));
    }
    public double perimetro(){
        return v1.distancia(v2) + v1.distancia(v3) + v2.distancia(v3);
    }
    public Punto centro(){
        return new Punto((v1.obtenerX() + v2.obtenerX() + v3.obtenerX())/3,
                        (v1.obtenerY() + v2.obtenerY() + v3.obtenerY())/3);
    }
    public boolean equals(Figura f){
        // Profundidad
        boolean iguales;
        if (f == null)
            iguales = false;
        else if (f == this)
            iguales = true;
        else if (getClass() == getClass()){
            Triangulo t = (Triangulo) f;
            iguales = area() == t.area() && perimetro() == t.perimetro() && centro().equals(t.centro()); 
        }
        else iguales = false;
        return iguales;
    }
}
