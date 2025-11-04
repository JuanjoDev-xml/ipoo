public class ColeccionRefugios {
    // Atributos de instancia
    protected Refugio[] col;
    protected int cant;
    // Constructor
    public ColeccionRefugios(int n){
        // Requiere n > 0
        col = new Refugio[n];
        cant = 0;
    }
    // Comandos
    public void insertarRefugio(Refugio r){
        // Requiere r ligado
        if (!estaLlena()){
            col[cant] = r;
            cant++;
        }
    }
    private void arrastrar(int pos){// Método privado para eliminarEscasaSup
        for (int i = pos; i > cant; i++){
            col[i] = col[i+1];
        }
    }
    public void eliminarEscasaSupervivencia(){
        for (int i = 0; i < cant; i++){
            if (col[i].diasSupervivencia() <= 1){
                arrastrar(i);
                col[i] = null;
                cant--;
            }
        }
    }
    // Consultas
    public int cantRefugios(){
        return cant;
    }
    public int cantElementos(){
        return col.length;
    }
    public boolean estaLlena(){
        return cantRefugios() == cantElementos();
    }
    public Refugio obtenerRefugio(int pos){
        Refugio res = null;
        if (pos >= 0 && pos < cantRefugios())
            res = col[pos];
        return res;
    }
    public boolean hayNSeguidosHabitables(int n){
        boolean hay = false;
        int cantConsec = 0;
        for (int i = 0; i < cantRefugios() && !hay; i++){
            if (col[i].esHabitable())
                cantConsec++;
            else
                cantConsec = 0;
            hay = cantConsec >= n;
        }
        return hay;
    }
    public boolean equals(ColeccionRefugios c){
        // Profundidad
        boolean iguales = c != null && cantElementos() == c.cantElementos()
                            && cantRefugios() == c.cantRefugios();
        for (int i = 0; i < cantElementos() && iguales; i++){
            iguales = col[i].equals(c.obtenerRefugio(i));
        }
        return iguales;
    }
}
