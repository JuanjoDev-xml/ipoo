public class Coleccion{
    // Atributos de instancia
    protected Elemento[] col;
    protected int cant;
    // Constructor
    public Coleccion(int max){
        // Requiere max > 0
        col = new Elemento[max];
        cant = 0;
    }
    // Comandos
    public void insertar(Elemento e){
        // Requiere que la estructura no esté llena
        // Requiere e ligado y no hay equivalente
        col[cant] = e;
    }
    public void eliminar(Elemento e){
        if (e != null){
            boolean encontre = false;
            int pos = 0;
            while(!encontre && pos < cant){
                if (col[pos].esEquivalente(e)){
                    encontre = true;
                }
                else{
                    pos++;
                }
            }
            if (encontre){
                for (int i = pos; i < cant; i++){
                    col[i] = col[i+1];
                }
                cant--;
            }
        }
    }
    public void ordenada(){
        // Shaker short
    }
    // Consultas
    public boolean estaLlena(){
        return cant == col.length;
    }
    public boolean hayElementos(){
        return cant > 0;
    }
    public int cantElementos(){
        return cant;
    }
    public boolean existePosicion(int p){
        return p >= 0 && p < cant;
    }
    public Elemento recuperarElemento(int p){
        Elemento res = null;
        if (existePosicion(p))
            res = col[p];
        return res;
    }
    public boolean estaElemento(Elemento e){
        // Requiere e ligada
        boolean esta = false;
        for (int i = 0; i < cant && !esta; i++)
            esta = col[i].esEquivalente(e);
        return esta;
    }
}