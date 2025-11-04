public class Staff {
    // Atributos de instancia
    protected Rubrica[] s;
    protected int cant;
    // Constructor
    public Staff(int max){
        s = new Rubrica[max];
    }
    // Comandos
    public boolean agregarRubrica(Rubrica r){
        boolean res = false;
        if (r != null && !estaLlena()){
            s[cant] = r;
            cant++;
            res = true;
        }
        return res;
    }
    public void eliminar(int p){
        for (int i = 0; i < cant; i++){
            if (s[i].productividad() < p){
                s[i] = null;
                s[i] = s[cant - 1];
                cant--;
            }
        }
    }
    // Consultas
    public boolean estaLlena(){
        return cant == s.length;
    }
    public int cantPosiciones(){
        return s.length;
    }
    public int cantRubricas(){
        return cant;
    }
    public Rubrica obtenerRubrica(int p){
        // Requiere p válida
        return s[p];
    }
    public int contarMayorP(int p){
        int cantidad = 0;
        for (int i = 0; i < cant; i++){
            if (s[i].productividad() > p) cant++;
        }
        return cantidad;
    }
    public Staff totalMayorT(int t){
        Staff nueva = new Staff(cantPosiciones());
        for (int i = 0; i < cant; i++){
            if (s[i].total() > t)
                nueva.agregarRubrica(s[i]);
        }
        return nueva;
    }
}
