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
        //if (!estaLlena()){
            col[cant] = r;
            cant++;
        //}
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
}
