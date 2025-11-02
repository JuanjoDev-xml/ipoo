abstract class Alojamiento {
    // Atributos de instancia
    protected int id;
    protected int personas;
    protected DatosPostales datosPostales;
    // Constructor
    public Alojamiento(int id, int p){
        this.id = id;
        personas = p;
    }
    // Consultas
    public int obtenerId(){
        return id;
    }
    public int obtenerPersonas(){
        return personas;
    }
    public String toString(){
        return id + personas + datosPostales.toString();
    }
    public abstract float costoDiario(int p);
}
