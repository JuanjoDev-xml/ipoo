public class Rectangulo extends Figura{
    // Atributos de instancia
    protected float ladoMayor, ladoMenor;
    protected Punto centro;
    // Constructor
    public Rectangulo(float lMa, float lMe, Punto c){
        ladoMayor = lMa;
        ladoMenor = lMe;
        centro = c;
    }
    // Consultas
    public double area(){
        return ladoMayor * ladoMenor;
    }
    public double perimetro(){
        return ladoMayor + ladoMenor;
    }
    public Punto centro(){
        return centro;
    }
    public boolean equals(Figura f){
        // Profundidad
        boolean iguales;
        if (f == null)
            iguales = false;
        else if (this == f)
            iguales = true;
        else if (getClass() == f.getClass()){
            Rectangulo r = (Rectangulo) f;
            iguales = area() == r.area() && perimetro() == r.perimetro() && centro().equals(r.centro());
        }
        else iguales = false;
        return iguales;
    }
}
