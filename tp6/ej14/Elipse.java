public class Elipse extends Figura{
    // Atributos de instancia
    protected float ejeMayor;
    protected float ejeMenor;
    protected Punto centro;
    // Constructor
    public Elipse(float eMa, float eMe, Punto c){
        ejeMayor = eMa;
        ejeMenor = eMe;
        centro = c;
    }
    // Consultas
    public double area(){
        return 3.14 * ejeMayor * ejeMenor;
    }
    public double perimetro(){
        return 6.26 * Math.sqrt(((ejeMayor/2)*(ejeMayor/2) + (ejeMenor/2)*(ejeMenor/2))/2);
    }
    public Punto centro(){
        return centro;
    }
    public boolean equals(Figura f){
        boolean iguales;
        if (f == null)
            iguales = true;
        else if (this == f)
            iguales = true;
        else if (getClass() == f.getClass()){
            Elipse e = (Elipse) f;
            iguales = area() == e.area() && perimetro() == e.perimetro() && centro.equals(e.centro());
        }
        else iguales = false;
        return iguales;
    }
}
