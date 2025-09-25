public class Oracion {
    // Atributos de instancia
    char[] s;
    // Constructor
    public Oracion(String str){
        /* Requiere str formada por una o más palabras
        separadas por al menos un blanco */
        /* Requiere que str comience con una palabra
        y termine con un blanco */
        /* Requiere que cada palabra de la oración esté
        formada por una o más letras mayúsculas */
        s = new char[str.length()];
    }
    // Comandos
    public void reducirBlancos(){

    }
    public void establecerLetra(int pos, char l){
        /* Requiere pos válida y l letra mayúscula
        o espacio en blanco */
        s[pos] = l;
    }
    // Consultas
    public char obtenerLetra(int pos){
        // Requiere pos válida
        return s[pos];
    }
    public boolean esLetra(int pos){
        return pos >= 0 && pos < longitud() && s[pos] != ' ';
    }
    public boolean esPrimeraPalabra(int pos){
        return pos >= 0 && pos < longitud() && (pos == 0 || s[pos-1] == ' ');
    }
    public int longitud(){
        return s.length;
    }
    public int contarPalabras(){
        // ni idea
        return 1;
    }
    public int masLarga(){
        int longi = 0;
        int mayorLong = 0;
        for(int i = 0; i < contarPalabras(); i++){   
            for(int j = 0; j < longitud() && s[j] != ' '; j++){
                longi++;
            }
            if (longi > mayorLong) mayorLong = longi;
            longi = 0;
        }
        return mayorLong;
    }
    public boolean hayNVocales(int n){
        boolean res = false;
        int cant = 0;
        for(int i = 0; i < longitud() && cant < n+1; i++){
            if(s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' ||
                s[i] == 'U') cant++;
        }
        if (cant == n) res = true;
        return res;
    }
    public boolean dosVocalesConsecutivas(){
        boolean hay = false;
        int cantConsec = 0;
        for(int i = 0; i < longitud() && !hay; i++){
            if(s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' ||
                s[i] == 'U') cantConsec++;
            else cantConsec = 0;
            if (cantConsec == 2) hay = true;
        }
        return hay;
    }
    public SecuenciaEnteros histograma(){
        // QUE
        int cantA = 0; int cantB = 0; int cantC = 0; int cantD = 0;
        SecuenciaEnteros sec = new SecuenciaEnteros(26);
        for (int i = 0; i < sec.cantElementos(); i++){
            switch (s[i]) {
                case 'A':
                    cantA++;
                    sec.establecerEntero(0, cantA);
                    break;
                case 'B':
                    cantB++;
                    sec.establecerEntero(1, cantB);
                    break;
                case 'C':
                    cantC++;
                    sec.establecerEntero(2, cantC);
                    break;
                case 'D':
                    cantD++;
                    sec.establecerEntero(3, cantD);
                    break;
                default:
                    break;
            }
        }
        return sec;
    }
}
