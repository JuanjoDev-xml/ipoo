public class GrillaReales{
    // Atributos de instancia
    private float[][] grilla;
    // Constructor
    public GrillaReales(int f, int c){
        // Requiere f, c > 0
        grilla = new float[f][c];
    }
    // Comandos
    public void establecerReal(int f, int c, float r){
        // Requiere 0 <= f < cantFilas()
        // Requiere 0 <= c < cantColumnas()
        grilla[f][c] = r;
    }
    public void reemplazar(float r1, float r2){
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                if (grilla[i][j] == r1) grilla[i][j] = r2;
            }
        }
    }
    public void reemplazar(float r1, float r2, int f){
        // Requiere 0 <= f < cantFilas()
        boolean encontre = false;
        for (int i = cantColumnas() - 1; i >= 0 && !encontre; i++){
            if (grilla[f][i] == r1){
                grilla[f][i] = r2;
                encontre = true;
            }
        }
    }
    public boolean intercambiarFilas(int f1, int f2){
        boolean res = false;
        if (0 <= f1 && f1 < cantFilas() && 0 <= f2 && f2 < cantFilas()){
            res = true;
            float aux;
            for (int i = 0; i < cantColumnas(); i++){
                aux = grilla[f1][i];
                grilla[f1][i] = grilla[f2][i];
                grilla[f2][i] = aux;
            }
        }
        return res;
    }
    // Consultas
    public float obtenerReal(int f, int c){
        // Requiere 0 <= f < cantFilas()
        // Requiere 0 <= c < cantColumnas()
        return grilla[f][c];
    }
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public float total(){
        float res = 0;
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                res += grilla[i][j];
            }
        }
        return res;
    }
    public float totalColumna(int c){
        // Requiere 0 <= c < cantColumnas()
        float res = 0;
        for (int i = 0; i < cantFilas(); i++){
            res += grilla[i][c];
        }
        return res;
    }
    public boolean estaNum(float r){
        boolean esta = false;
        for (int i = 0; i < cantFilas() && !esta; i++){
            for (int j = 0; j < cantColumnas() && !esta; j++){
                if (grilla[i][j] == r) esta = true;
            }
        }
        return esta;
    }
    public int cantidadMayores(float r){
        int cant = 0;
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                if (grilla[i][j] > r) cant++;
            }
        }
        return cant;
    }
    public boolean esFilaCreciente(int f){
        // Requiere 0 <= f < cantFilas()
        boolean es = true;
        for (int i = 1; i < cantColumnas() && es; i++){
            if (grilla[f][i] <= grilla[f][i-1]) es = false;
        }
        return es;
    }
    public boolean hayNMayoresConsecutivos(int n, float r){
        int cantConsec = 0;
        boolean cumple = false;
        if (n <= cantColumnas()){
            for (int i = 0; i < cantFilas() && !cumple; i++){
                for (int j = 0; j < cantColumnas() && cantConsec <= n; j++){
                    if (grilla[i][j] > r) cantConsec++;
                    else cantConsec = 0;
                }
                cumple = cantConsec == n;
                cantConsec = 0;
            }
        }
        return cumple;
    }
    public boolean esTranspuesta(GrillaReales g){
        boolean es = g != null && cantFilas() == g.cantColumnas() &&
                    cantColumnas() == g.cantFilas();
        for (int i = 0; i < cantFilas() && es; i++){
            for (int j = 0; j < cantColumnas() && es; j++){
                if (grilla[i][j] != g.obtenerReal(j, i)) es = false;
            }
        }
        return es;
    }
    public GrillaReales transpuesta(){
        GrillaReales transp = new GrillaReales(cantColumnas(), cantFilas());
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas(); j++){
                transp.establecerReal(j, i, grilla[i][j]);
            }
        }
        return transp;
    }
}