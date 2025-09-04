public class Prestamo {
    // Atributos de instancia
    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo;
    private Fecha fechaDevolucion;
    private boolean devuelto;
    // Constructor
    public Prestamo(Libro l, Fecha fp, Fecha fd, String s){
        // Requiere l, fp, fd y s ligados
        libro = l;
        fechaPrestamo = fp;
        fechaDevolucion = fd;
        socio = s;
        devuelto = false;
    }
    // Consultas
    public Libro obtenerLibro(){
        return libro;
    }
    public Fecha obtenerFechaPrestamo(){
        return fechaPrestamo;
    }
    public Fecha obtenerFechaDevolucion(){
        return fechaDevolucion;
    }
    public boolean estaDevuelto(){
        return devuelto;
    }
    public String obtenerSocio(){
        return socio;
    }
    public boolean estaAtrasado(Fecha hoy){
        return !estaDevuelto() && fechaDevolucion.esAnterior(hoy);
    }
    public Prestamo masAntiguo(Prestamo p){
        Prestamo pres;
        if (fechaPrestamo.esAnterior(p.obtenerFechaPrestamo())) {
            pres = this;
        }
        else{
            pres = p;
        }
        return pres;
    }
    public boolean equals(Prestamo p){ // está bien ????????????????
        return libro == p.obtenerLibro() && socio.equals(p.obtenerSocio())
                && fechaPrestamo.equals(p.obtenerFechaPrestamo())
                && fechaDevolucion.equals(p.obtenerFechaDevolucion());
    }
    public String toString(){
        return libro + " " + socio + " " + fechaPrestamo + " " +
        fechaDevolucion + " " + devuelto;
    }
}
