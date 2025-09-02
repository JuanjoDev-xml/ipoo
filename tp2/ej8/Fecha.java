public class Fecha {
    // Atributos de instancia
    private int dia;
    private int mes;
    private int anio;
    // Constructor
    public Fecha(int d, int m, int a){
        // Requiere valores válidos
        dia = d;
        mes = m;
        anio = a;
    }
    // Comandos
    public void establecerDia(int d){
        dia = d;
    }
    public void establecerMes(int m){
        mes = m;
    }
    public void establecerAnio(int a){
        anio = a;
    }
    // Consultas
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }
    public boolean esBisiesto(){
        return anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0);
    }
    public boolean esAnterior(Fecha f){
        // Requiere f ligada
        boolean anterior = true;
        if (anio > f.obtenerAnio()) {
            anterior = false;
        }
        else{
            if (anio == f.obtenerAnio()) {
                if (mes > f.obtenerMes()) {
                    anterior = false;                    
                }
                else{
                    if (mes == f.obtenerMes() && dia >= f.obtenerDia()) {
                        anterior = false;
                    }
                }
            }
        }
        return anterior;
    }
    public boolean mismoAnio(Fecha f){
        return anio == f.obtenerAnio();
    }
    public boolean equals(Fecha f){
        // Requiere f ligada
        return anio == f.obtenerAnio() && mes == f.obtenerMes() && dia == f.obtenerDia();
    }
    public String toString() {
        return anio + " " + mes + " " + dia; 
    }
}
