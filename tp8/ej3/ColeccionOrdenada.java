public class ColeccionOrdenada {
    // Atributos de instancia
    protected Elemento[] t;
    protected int cant;
    // Constructor
    public ColeccionOrdenada(int max){
        // Requiere max > 0
        t = new Elemento[max];
        cant = 0;
    }
    // Comandos
    protected int obtenerPosicion(Elemento e){ // Método auxiliar para insertar
        int pos = 0;
        boolean encontre = false;
        while (pos < cant && !encontre)
            if (t[pos].esMayor(e))
                encontre = true;
            else
                pos++;
        return pos;
    }
    protected void arrastrarAbajo(int pos){ // Método auxiliar para insertar
        for (int i = cant; i > pos; i--)
            t[i] = t[i-1];
    }
    public void insertar(Elemento e){
        int pos = obtenerPosicion(e);
        arrastrarAbajo(pos);
        t[pos] = e;
        cant++;
    }
    public void eliminar (Elemento e){
        if (e != null){
            int pos;
            boolean encontre = false;
            for (pos = 0; pos < cant && !encontre; pos++){ // obtenerPosicion
                if (t[pos].esEquivalente(e))
                    encontre = true;
            }
            if (encontre){
                cant--;
                for (int i = pos; i < cant; i++) // arrastrarArriba
                    t[i] = t[i+1];
            }
        }
    }
    // Consultas
    public boolean estaLlena(){
        return cant == t.length;
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
            res = t[p];
        return res;
    }
    public boolean estaElemento(Elemento e){
        // Requiere e ligada
        // Binary search
        boolean esta = true;
        return esta;
    }
    public ColeccionOrdenada intercalar(ColeccionOrdenada c){
        ColeccionOrdenada cole = this;
        if (c != null){
            for (int i = 0; i < cant + c.cantElementos(); i++){
                cole.insertar(c.recuperarElemento(i));
            }
        }
        return cole;
    }
}
