public class ConsumoEdificio {
    // Atributos de instancia
    private MedicionServicios[] consumoXPiso;
    // Constructor
    public ConsumoEdificio(int pisos){
        // Requiere pisos mayor a 1
        consumoXPiso = new MedicionServicios[pisos];
    }
    // Comandos
    public boolean registrarConsumo(MedicionServicios m, int p){
        boolean res = false;
        if (p > 1 && p <= consumoXPiso.length){
            consumoXPiso[p] = m;
            res = true;
        }
        return res;
    }
    public boolean eliminarConsumo(int p){
        boolean res = false;
        if (p > 1 && p <= consumoXPiso.length){
            consumoXPiso[p] = null;
            res = true;
        }
        return res;
    }
    public void eliminarCeros(){
        int cant = 0;
        for (int i = 1; i <= cantPosiciones(); i++){
            if (consumoXPiso[i] != null){
                if (consumoXPiso[i].obtenerAgua() == 0) cant++;
                if (consumoXPiso[i].obtenerGas() == 0) cant++;
                if (consumoXPiso[i].obtenerElectricidad() == 0) cant++;
                if (cant >= 2) consumoXPiso[i] = null;
            }
            cant = 0;
        }
    }
    // Consultas
    public int cantPosiciones(){
        return consumoXPiso.length;
    }
    public int cantPisos(){
        int cant = 0;
        for (int i = 1; i <= cantPosiciones(); i++){
            if (consumoXPiso[i] != null) cant++;
        }
        return cant;
    }
    public MedicionServicios obtenerMedicionServicios(int p){
        // Requiere p válido
        return consumoXPiso[p];
    }
    public boolean hayMayorConsumo(int c){
        boolean hay = false;
        for (int i = 1; i <= cantPosiciones() && !hay; i++){
            if (consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c)
                hay = true;
        }
        return hay;
    }
    public int cuantasMayores(int c){
        int cant = 0;
        for (int i = 1; i <= cantPosiciones(); i++){
            if (consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c)
                cant++;
        }
        return cant;
    }
    public int primerPisoMayor(int c){
        int res = -1;
        boolean hay = false;
        for (int i = 1; i <= cantPosiciones() && !hay; i++){
            if (consumoXPiso[i].costoServicios() > c){
                hay = true;
                res = i;
            }
        }
        return res;
    }
    public int ultimoPisoMayor(int c){
        int res = -1;
        boolean hay = false;
        for (int i = cantPosiciones(); i >= 1 && !hay; i--){
            if (consumoXPiso[i].costoServicios() > c){
                hay = true;
                res = i;
            }
        }
        return res;
    }
    public boolean nMayores(int c, int n){
        int cant = 0;
        for (int i = 1; i <= cantPosiciones() && cant <= n; i++){
            if (consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c)
                cant++;
        }
        return cant == n;
    }
    public boolean todosMayores(int c){
        boolean todos = true;
        for (int i = 1; i <= cantPosiciones() && todos; i++){
            if (consumoXPiso[i] != null && consumoXPiso[i].costoServicios() <= c)
                todos = false;
        }
        return todos;
    }
    public boolean todosMayores(MedicionServicios m){
        // Requiere m ligada
        boolean todos = true;
        for (int i = 1; i <= cantPosiciones() && todos; i++){
            if (consumoXPiso[i] != null){
                if (consumoXPiso[i].obtenerAgua() <= m.obtenerAgua()) todos = false;
                else if (consumoXPiso[i].obtenerGas() <= m.obtenerGas()) todos = false;
                else if (consumoXPiso[i].obtenerElectricidad() <= m.obtenerElectricidad()) todos = false;
            }
        }
        return todos;
    }
}