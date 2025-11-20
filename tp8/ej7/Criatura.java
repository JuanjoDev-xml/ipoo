public class Criatura extends Elemento{
    // Atributos de clase
    protected static final int maxEnergia = 1000;
    // Atributos de instancia
    protected String nombre;
    protected int energia;
    // Constructor
    public Criatura(String nom){
        // Requiere nom ligado
        nombre = nom;
        energia = maxEnergia;
    }
    // Comandos
    public void jugar(){
        if (energia > 0)
            energia--;
    }
    // Consultas
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerEnergia(){
        return energia;
    }
    public boolean equals(Elemento c){
        // Superficial
        boolean iguales = c != null;
        if (iguales && this != c){
            if (getClass() == c.getClass()){
                Criatura cri = (Criatura) c;
                iguales = nombre == cri.obtenerNombre() && energia == cri.obtenerEnergia();
            }
            else
                iguales = false;
        }
        return iguales;
    }
    public boolean complemento(Elemento c){
        boolean comp = c != null;
        if (comp && c != this){
            if (getClass() == c.getClass()){
                Criatura cri = (Criatura) c;
                comp = energia + cri.obtenerEnergia() > maxEnergia;
            }
            else
                comp = false;
        }
        return comp;
    }
}
