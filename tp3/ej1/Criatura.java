public class Criatura {
    // Atributos de clase
    private int maxEnergia = 100;
    private int minEnergia = 0;
    private int consumoEnergia = 10;
    // Atributos de instancia
    private int energia;
    private Refugio refugio;
    private boolean despierto;
    private int caminatas;
    // Constructor
    public Criatura(Refugio r){
        // Requiere r ligada
        refugio = r;
        energia = maxEnergia;
        despierto = true;
        caminatas = 0;
    }
    // Comandos
    public boolean comer(){
        boolean res = false;
        if(despierto && refugio.obtenerAlimentos() > 0){
            if (energia < maxEnergia) energia++;
            refugio.consumirAlimento();
            res = true;
        }
        return res;
    }
    public boolean beber(){
        boolean res = false;
        if(despierto && refugio.obtenerBebidas() > 0){
            if (energia < maxEnergia) energia++;
            refugio.consumirBebida();
            res = true;
        }
        return res;
    }
    public boolean dormir(){
        boolean res = false;
        if(despierto && refugio.obtenerCamas() < 10){
            refugio.ocuparCama();
            despierto = false;
            res = true;
        }
        return res;
    }
    public boolean despertar(){
        boolean res = false;
        if(!despierto){
            refugio.desocuparCama();
            despierto = true;
            caminatas = 0;
            res = true;
        }
        return res;
    }
    public boolean caminar(){
        boolean res = true;
        if (despierto && energia > 0) {
            energia -= consumoEnergia;
            if (caminatas < 4) caminatas++;
            else{
                res = false;
                if(refugio.obtenerCamas() < 10){
                    refugio.ocuparCama();
                    dormir(); // aumenta caminatas ?????????????????????????????
                }
                else energia = minEnergia;
            }
        }
        return res;
    }
    // Consultas
    public int obtenerEnergia(){
        return energia;
    }
    public int obtenerCaminatas(){
        return caminatas;
    }
    public int obtenerHumor(){
        int res = 1;
        if (refugio.esHabitable() && energia > 40){
            if (energia <= 70) res = 2;
            else res = 3;
        }
        return res;
    }
    public boolean estaDormido(){
        return !despierto; // está bien pensado ???????????????????
    }
    public boolean mayorEnergia(Criatura c){
        return energia > c.obtenerEnergia(); // no hay que checkear c ligada??? creo que no
    }
    public String toString(){
        return energia + " " + refugio + " " + despierto + " " + caminatas;
    }
}
