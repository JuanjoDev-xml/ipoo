class B{
    private C c1;
    private char c2;
    public B (C p1, char p2) {
        c1 = p1;
        c2 = p2;
    }
    public C obtenerC1() {
         return c1;
    }
    public char obtenerC2() {
        return c2;
    }
    public B clone () {
        return new B(c1,c2);
    }
    public boolean equals(B p) {
        return (c1 == p.obtenerC1() && c2 == p.obtenerC2());
    }
}