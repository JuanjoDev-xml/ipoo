public class Conjunto {
    // Atributos de instanacia
    protected Elemento[] co;
    protected int cant;
    // Constructor
    public Conjunto(int max){
        // Requiere max > 0
        co = new Elemento[max];
        cant = 0;
    }
    // Comandos
    public void insertar(Elemento e){
        if (e != null){
            co[cant] = e;
            cant++;
        }
    }
    // Consultas
    public boolean pertenece(Elemento e){
        boolean esta = e == null;
        for (int i = 0; i < cant && !esta; i++)
            if (co[i].equals(e))
                esta = true;
        return esta;
    }
    public Conjunto interseccion(Conjunto c){
        Conjunto inter = null;
        if (c != null){
            inter = new Conjunto(cant);
            for (int i = 0; i < cant; i++)
                if (c.pertenece(co[i]))
                    inter.insertar(co[i]);
        }
        return inter;
    }
    public boolean aLoSumoNComplemento(int n, Elemento e){
        boolean cumple = e != null;
        int cantComp = 0;
        for (int i = 0; i < cant && cumple; i++){
            if (co[i].complemento(e))
                cantComp++;
            if (cantComp > n)
                cumple = false;
        }
        return cumple;
    }
    public int cantElementos(){
        return cant;
    }
}