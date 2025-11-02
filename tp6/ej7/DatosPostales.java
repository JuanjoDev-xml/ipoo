public class DatosPostales{
    // Atributos de instancia
    protected String domicilio;
    protected String edificio;
    protected int cp;
    // Constructor
    public DatosPostales(String d, String e, int c){
        domicilio = d;
        edificio = e;
        cp = c;
    }
    // Consultas
    public String obtenerDomicilio(){
        return domicilio;
    }
    public String obtenerEdificio(){
        return edificio;
    }
    public int obtenerCP(){
        return cp;
    }
    public String toString(){
        return domicilio + edificio + cp;
    }
}