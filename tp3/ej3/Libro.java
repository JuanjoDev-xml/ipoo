public class Libro{
    // Atributos de instancia
    private String nombre;
    private String autor;
    private String editorial;
    private char categoria;
    // Constructor
    public Libro(String n, String a, String e, char c){
        nombre = n;
        autor = a;
        editorial = e;
        categoria = c;
    }
    // Comandos
    public void establecerNombre(String p){
        nombre = p;
    }
    public void establecerAutor(String p){
        autor = p;
    }
    public void establecerEditorial(String p){
        editorial = p;
    }
    public void establecerCategoria(char p){
        categoria = p;
    }
    // Consultas
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerautor(){
        return autor;
    }
    public String obtenerEditorial(){
        return editorial;
    }
    public char obtenerCategoria(){
        return categoria;
    }
    public String toString(){
        return nombre + " " + autor + " " + editorial + " " + categoria;
    }
}