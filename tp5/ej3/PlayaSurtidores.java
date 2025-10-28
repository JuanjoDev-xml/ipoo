public class PlayaSurtidores {
    // Atributos de instancia
    protected Surtidor[] Tabla;
    // Constructores
    public PlayaSurtidores(int n){
        // Requiere n > 0
        Tabla = new Surtidor[n];
    }
    public PlayaSurtidores(){
        Tabla = new Surtidor[10];
    }
    // Comandos
    public void establecerSurtidor(Surtidor s, int p){
        // Requiere p válida
        Tabla[p] = s;
    }
    public void establecerSurtidor(Surtidor s){
        // Requiere que la tabla no esté llena
        boolean pude = false;
        for (int i = 0; i < cantPosiciones() && !pude; i++){
            if (Tabla[i] == null){
                Tabla[i] = s;
                pude = true;
            }
        }
    }
    public void llenaDepositos(){
        for (int i = 0; i < cantPosiciones(); i++){
            if (Tabla[i] != null){
                Tabla[i].llenarDepositoGasoil();
                Tabla[i].llenarDepositoPremium();
                Tabla[i].llenarDepositoSuper();
            }
        }
    }
    public void agrupaSurtidores(){
        int pos = 0;
        for (int i = 0; i < cantPosiciones(); i++){
            if (Tabla[i] != null){
                Tabla[pos] = Tabla[i];
                pos++;
            }
        }
    }
    // Consultas
    public int cantPosiciones(){
        return Tabla.length;
    }
    public int cantSurtidores(){
        int cant = 0;
        for (int i = 0; i < cantPosiciones(); i++){
            if (Tabla[i] != null) cant++;
        }
        return cant;
    }
    public Surtidor obteneSurtidor(int p){
        // Requiere p válida
        return Tabla[p];
    }
    public int cantMaximaCarga(){
        int cant = 0;
        for (int i = 0; i < cantPosiciones(); i++){
            if (Tabla[i] != null && Tabla[i].depositosLlenos()) cant++;
        }
        return cant;
    }
    public boolean mismosNulos(PlayaSurtidores ps){
        boolean mismos = ps != null;
        for (int i = 0; i < cantPosiciones() && mismos; i++){
            if ((Tabla[i] == null && ps.obteneSurtidor(i) != null)
                || (Tabla[i] != null && ps.obteneSurtidor(i) == null)) mismos = false;
        }
        return mismos;
    }
    public PlayaSurtidores clone(){
        // Superficial
        PlayaSurtidores clon = new PlayaSurtidores(cantPosiciones());
        for (int i = 0; i < cantPosiciones(); i++){
            clon.establecerSurtidor(Tabla[i]);
        }
        return clon;
    }
    public PlayaSurtidores nLigados(int n){
        PlayaSurtidores res = null;
        PlayaSurtidores playa = new PlayaSurtidores(n);
        boolean tiene = false;
        int cant = 0;
        for (int i = 0; i < cantPosiciones() && !tiene; i++){
            if (Tabla[i] != null){
                playa.establecerSurtidor(Tabla[i], cant);
                cant++;
            }
            else cant = 0;
            tiene = cant >= n;
        }
        if (tiene) res = playa;
        return res;
    }
}
