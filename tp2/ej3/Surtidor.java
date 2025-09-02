public class Surtidor{
    // Atributos de clase
    private static final int maximaCarga = 20000;
    // Atributos de instancia
    private int cantGasoil;
    private int cantSuper;
    private int cantPremium;
    // Constructor
    public Surtidor(){
        cantGasoil = maximaCarga;
        cantSuper = maximaCarga;
        cantPremium = maximaCarga;
    }
    // Comandos
    public void llenarDepositoGasoil(){
        cantGasoil = maximaCarga;
    }
    public void llenarDepositoSuper(){
        cantSuper = maximaCarga;
    }
    public void llenarDepositoPremium(){
        cantPremium = maximaCarga;
    }
    public void extraerGasoil(int litros){
        // Requiere litros > 0
        if (cantGasoil > litros)
            cantGasoil -= litros;
        else
            cantGasoil = 0;
    }
    public void extraerSuper(int litros){
        // Requiere litros > 0
        if (cantSuper > litros)
            cantSuper -= litros;
        else
            cantSuper = 0;
    }
    public void extraerPremium(int litros){
        // Requiere litros > 0
        if (cantPremium > litros)
            cantPremium -= litros;
        else
            cantPremium = 0;
    }
    // Consultas
    public int obtenerMaximaCarga(){
        return maximaCarga;
    }
    public int obtenerLitrosGasoil(){
        return cantGasoil;
    }
    public int obtenerLitrosSuper(){
        return cantSuper;
    }
    public int obtenerLitrosPremium(){
        return cantPremium;
    }
    public boolean depositosLlenos(){
        return cantGasoil == maximaCarga && cantSuper == maximaCarga && cantPremium == maximaCarga;
    }
}