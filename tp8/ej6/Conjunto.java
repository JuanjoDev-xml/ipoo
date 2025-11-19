public class Conjunto {
    // Atributos de instancia
    protected Elemento[] ce;
    protected int cantElementos;
    // Constructor
    public Conjunto(int max){
        if (max > 0)
            ce = new Elemento[max];
        else
            ce = new Elemento[1];
    }
    // Comandos
    public void insertar(Elemento e){
        if (e != null && !pertenece(e)){
            ce[cantElementos] = e;
            cantElementos++;
        }
    }
    // Consultas
    public boolean pertenece(Elemento e){
        boolean esta = e == null;
        for (int i = 0; i < cantElementos && !esta; i++)
            if (ce[i].esEquivalente(e))
                esta = true;
        return esta;
    }
    public boolean vacio(){
        return cantElementos == 0;
    }
    public boolean incluido(Conjunto c){
        boolean esta = c != null && cantElementos <= c.cardinalidad();
        for (int i = 0; i < c.cardinalidad() && esta; i++)
            if (!c.pertenece(ce[i]))
                esta = false;
        return esta;
    }
    public boolean esEquivalente(Conjunto c){
        return c != null && cantElementos == c.cardinalidad() && incluido(c);
    }
    public boolean disjunto(Conjunto c){
        boolean disj = c != null;
        for (int i = 0; i < cantElementos && disj; i++)
            if (c.pertenece(ce[i]))
                disj = false;
        return disj;
    }
    private Elemento obtenerElemento(int p){
        return ce[p];
    }
    public Conjunto union(Conjunto c){
        Conjunto unidos = this;
        if (c != null){
            unidos = new Conjunto(cantElementos + c.cardinalidad());
            for (int i = 0; i < cantElementos; i++){
                insertar(ce[i]);
                insertar(c.obtenerElemento(i));
            }
        }
        return unidos;
    }
    public Conjunto interseccion(Conjunto c){
        Conjunto intersectado = null;
        if (c != null){
            intersectado = new Conjunto(cantElementos);
            for (int i = 0; i < cantElementos; i++){
                if (c.pertenece(ce[i]))
                    intersectado.insertar(ce[i]);
            }
        }
        return intersectado;
    }
    public Conjunto diferencia(Conjunto c){
        Conjunto diferentes = null;
        if (c != null){
            diferentes = new Conjunto(cantElementos);
            for (int i = 0; i < cantElementos; i++){
                if (!c.pertenece(ce[i]))
                    diferentes.insertar(ce[i]);
            }
        }
        return diferentes;
    }
    public int cardinalidad(){
        return cantElementos;
    }
}
