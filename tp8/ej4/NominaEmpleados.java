public class NominaEmpleados extends Coleccion{
    // Constructor
    public NominaEmpleados(int n){
        super(n);
    }
    // Consultas
    public int contarSupHoras(int h){
        int cantidad = 0;
        Empleado e;
        for (int i = 0; i < cant; i++){
            e = (Empleado) col[i];
            if (e.obtenerCantHoras() > h)
                cantidad++;
        }
        return cantidad;
    }
    public float sumarSueldos(){
        float res = 0;
        Empleado e;
        for (int i = 0; i < cant; i++){
            e = (Empleado) col[i];
            res += e.obtenerSueldo();
        }
        return res;
    }
}
