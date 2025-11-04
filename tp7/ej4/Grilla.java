public class Grilla{
    // Atributos de instancia
    protected Figura[][] g;
    // Constructor
    public Grilla(int cantFil, int cantCol){
        g = new Figura[cantFil][cantCol];
    }
    // Comandos
    public void establecerFigura(int f, int c, Figura fig){
        // Requiere f y c válidas
        g[f][c] = fig;
    }
    public void intercambiar(int f1, int f2){
        // Requiere f1 y f2 válidos
        Figura aux;
        for (int i = 0; i < cantColumnas(); i++){
            aux = g[f1][i];
            g[f1][i] = g[f2][i];
            g[f2][i] = aux;
        }
    }
    // Consultas
    public int cantFilas(){
        return g.length;
    }
    public int cantColumnas(){
        return g[0].length;
    }
    public Figura obtenerFigura(int f, int c){
        // Requiere f y c válidas
        return g[f][c];
    }
    public int cantidadFiguras(){
        int cant = 0;
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                if (g[i][j] != null) cant++;
            }
        }
        return cant;
    }
    public int cantidadFiguras(float p, float r){
        int cant = 0;
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                if (g[i][j] != null && g[i][j].perimetro() >= p-r && g[i][j].perimetro() <= p+r)
                    cant++;
            }
        }
        return cant;
    }
    public boolean todosMayores(float x){
        boolean todas = true;
        for (int i = 0; i < cantFilas() && todas; i++){
            for (int j = 0; j < cantColumnas() && todas; j++){
                if (g[i][j] != null && g[i][j].area() <= x)
                    todas = false;
            }
        }
        return todas;
    }
    public int contarCoincidenciasArea(Grilla gr){
        int cant = 0;
        if (gr != null){
            for (int i = 0; i < cantFilas(); i++){
                for (int j = 0; j < cantColumnas(); j++){
                    if (g[i][j] != null && gr.obtenerFigura(i, j) != null){
                        if (g[i][j].area() == gr.obtenerFigura(i, j).area())
                            cant++;
                    }
                }  
            }
        }
        return cant;
    }
}