public class RefugioVip extends Refugio {
    // Atributos de clase
    protected static final int capacidadSillones = 4;
    // Atributos de instancia
    protected int sillones;
    // Constructor
    public RefugioVip(int a, int b, int c, int s){
        super(a, b, c);
        sillones = s;
    }
    // Comandos
    public boolean ocuparSillon(){
        boolean res = false;
        if (sillones < capacidadSillones){
            sillones++;
            res = true;
        }
        return res;
    }
    public boolean desocuparSillon(){
        boolean res = false;
        if (sillones > 0){
            sillones--;
            res = true;
        }
        return res;
    }
    // Consultas
    public int obtenerSillones(){
        return sillones;
    }
    public int disponibilidad(){
        return super.disponibilidad() + capacidadSillones - sillones;
    }
    public RefugioVip clone(){
        return new RefugioVip(alimentos, bebidas, camas, sillones);
    }
    public boolean equals(Refugio c){
        boolean iguales;
        if (c == null)
            iguales = false;
        else if (this == c)
            iguales = true;
        else if (getClass() != c.getClass())
            iguales = false;
        else{
            RefugioVip r = (RefugioVip) c;
            iguales = super.equals(r) && sillones == r.obtenerSillones();
        }
        return iguales;
    }
}
