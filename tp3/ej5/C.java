class C{
    private int d1;
    private char d2;
    public C (int p1, char p2) {
        d1 = p1;
        d2 = p2;
    }
    public int obtenerD1() {
        return d1;
    }
    public char obtenerD2() {
        return d2;
    }
    public C clone () {
        return new C (d1,d2);
    }
    public boolean equals(C p) {
        return (d1 == p.obtenerD1() && d2 == p.obtenerD2());
}
}