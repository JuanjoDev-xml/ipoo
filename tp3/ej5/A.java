class A{
    private B b1;
    private int b2;
    public A (B p1, int p2) {
        b1 = p1;
        b2 = p2;
    }
    public B obtenerB1(){
        return b1;
    }
    public int obtenerB2(){
        return b2;
    }
    public A clone () {
        return new A(b1.clone(), b2);
    }
    public boolean equals(A p) {
        return(b1.equals(p.obtenerB1()) && b2 == p.obtenerB2());
    }
}