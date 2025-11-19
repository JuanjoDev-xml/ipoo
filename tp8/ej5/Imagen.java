public class Imagen extends MatrizGenerica{
    // Constructor
    public Imagen(int n){
        super(n, n);
    }
    // Consultas
    public boolean todosGrises(){
        boolean todos = true;
        Color c;
        for (int i = 0; i < cantFilas() && todos; i++)
            for (int j = 0; j < cantColumnas() && todos; j++){
                if (m[i][j] != null){
                    c = (Color) m[i][j];
                    todos = c.esGris();
                }
            }
        return todos;
    }
}
