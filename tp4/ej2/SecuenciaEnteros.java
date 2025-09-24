package ej2;
public class SecuenciaEnteros{
    // Atributos de instancia
    private int sec[];
    // Constructor
    public SecuenciaEnteros(int cant){
        // Requiere cant > 10
        sec = new int[cant];
    }
    // Comandos
    public void establecerEntero(int p, int n){
        // Requiere 0 <= p < cantElementos()
        sec[p] = n;
    }
    public void reemplazar(int n1, int n2){
        for(int i = 0; i < cantElementos(); i++){
            if(sec[i] == n1){
                sec[i] = n2;
            }
        }
    }
    public void reemplazar(int n){
        boolean encontro = false;
        for(int i = 0; i < cantElementos() && !encontro; i++){
            if(sec[i] == n){
                encontro = true;
                sec[i] = 0;
            }
        }
        encontro = false;
        for(int i = cantElementos() - 1; i >= 0 && !encontro; i--){
            if(sec[i] == n){
                encontro = true;
                sec[i] = 0;
            }
        }
    }
    public boolean intercambiar(int p1, int p2){
        boolean res = false;
        if (p1 >=0 && p2 >= 0 && p1 < cantElementos() && p2 < cantElementos()){
            int aux = sec[p1];
            sec[p1] = sec[p2];
            sec[p2] = aux;
            res = true;
        }
        return res;
    }
    public boolean copy(SecuenciaEnteros a){
        boolean res = false;
        if (a != null && cantElementos() == a.cantElementos()) {
            for(int i = 0; i < cantElementos(); i++){
                sec[i] = a.obtenerEntero(i);
            }
            res = true;
        }
        return res;
    }
    // Consultas
    public int obtenerEntero(int p){
        // Requiere 0 <= p < cantElementos()
        return sec[p];
    }
    public int cantElementos(){
        return sec.length;
    }
    public int total(){
        int suma = 0;
        for(int i = 0; i < cantElementos(); i++){
            suma += sec[i];
        }
        return suma;
    }
    public boolean estaNum(int n){
        boolean esta = false;
        for(int i = 0; i < cantElementos() && !esta; i++){
            if (sec[i] == n) esta = true;
        }
        return esta;
    }
    public int cantidadMayores(int n){
        int cant = 0;
        for(int i = 0; i < cantElementos(); i++){
            if (sec[i] > n) cant++;
        }
        return cant;
    }
    public boolean mitadMayores(int n){
        boolean seCumple = false;
        int mitad;
        int cant = 0;
        if (cantElementos() % 2 != 0) mitad = (cantElementos() + 1)/2;
        else mitad = cantElementos()/2;
        for(int i = 0; i < cantElementos() && !seCumple; i++){
            if(sec[i] > n) cant++;
            if(cant == mitad) seCumple = true;
        }
        return seCumple;
    }
    public boolean equals(SecuenciaEnteros a){
        boolean iguales = a != null && cantElementos() == a.cantElementos();
        for(int i = 0; i < cantElementos() && iguales; i++){
            if(sec[i] != a.obtenerEntero(i)) iguales = false;
        }
        return iguales;
    }
    public SecuenciaEnteros clone(){ // está bien??????????
        SecuenciaEnteros res = new SecuenciaEnteros(cantElementos());
        for(int i = 0; i < cantElementos(); i++){
            res.sec[i] = this.sec[i];
        }
        return res;
    }
}