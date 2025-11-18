public class MatrizGenerica{
    // Atributos de instancia
    protected Elemento[][] m;
    // Constructor
    public MatrizGenerica(int nf, int nc){
        m = new Elemento[nf][nc];
    }
    // Comandos
    public void establecer(int f, int c, Elemento e){
        m[f][c] = e;
    }
    // Consultas
    public Elemento obtener(int f, int c){
        return m[f][c];
    }
    public int cantFilas(){
        return m.length;
    }
    public int cantColumnas(){
        return m[0].length;
    }
    public boolean pertenece(Elemento e){
        boolean esta = false;
        for (int i = 0; i < cantFilas() && !esta; i++)
            for (int j = 0; j < cantColumnas() && !esta; j++)
                if (m[i][j] != null && m[i][j].equals(e))
                    esta = true;
        return esta;
    }
    public int contarElem(Elemento e){
        int cant = 0;
        for (int i = 0; i < cantFilas(); i++)
            for (int j = 0; j < cantColumnas(); j++)
                if (m[i][j] != null && m[i][j].equals(e))
                    cant++;
        return cant;
    }
    public boolean esEquivalente(MatrizGenerica c){
        boolean iguales = c != null;
        for (int i = 0; i < cantFilas() && iguales; i++)
            for (int j = 0; j < cantColumnas() && iguales; j++){
                if ((m[i][j] == null && c.obtener(i, j) != null) || (m[i][j] != null && c.obtener(i, j) == null))
                    iguales = false;
                else if (m[i][j] != null && c.obtener(i, j) != null && !(m[i][j].equals(c.obtener(i, j))))
                    iguales = false;
            }
        return iguales;
    }
    public boolean esComplemento(MatrizGenerica c){
        boolean es = c != null && cantFilas() == c.cantFilas() && cantColumnas() == c.cantColumnas();
        for (int i = 0; i < cantFilas() && es; i++)
            for (int j = 0; j < cantColumnas() && es; j++){
                if ((m[i][j] == null && c.obtener(i, j) != null) || (m[i][j] != null && c.obtener(i, j) == null))
                    es = false;
                else if (m[i][j] != null && c.obtener(i, j) != null && m[i][j].complemento() != c.obtener(i, j))
                    es = false;
            }
        return es;
    }
    public MatrizGenerica clone(){
        // Profundidad
        MatrizGenerica clon = new MatrizGenerica(cantFilas(), cantColumnas());
        for (int i = 0; i < cantFilas(); i++)
            for (int j = 0; j < cantColumnas(); j++)
                if (m[i][j] != null)
                    clon.establecer(i, j, m[i][j].clone());
        return clon;
    }
}