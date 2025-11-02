public class Habitacion extends Alojamiento{
    // Atributos de instancia
    protected int camas;
    // Constructor
    public Habitacion(int id, int p, int c){
        super(id, p);
        camas = c;
    }
    // Consultas
    public int obtenerCamas(){
        return camas;
    }
    public float costoDiario(int p){
        return camas * (p / 2);
    }
}
