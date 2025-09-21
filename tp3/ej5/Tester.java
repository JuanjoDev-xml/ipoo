public class Tester{
    public static void main(String[]args){
        C vc = new C (10, 'a');
        B vb1 = new B (vc, '5');
        B vb2 = new B (vc.clone(), '5');
        A va1 = new A (vb1.clone(), 1);
        A va2 = new A (vb1.clone(), 1);
        A va3 = new A (vb2, 1);
        A va4 = new A ((new B ((new C(11, 'b')), 'c')), -1);
        System.out.println(va1.equals(va2));
        System.out.println(va1.equals(va3));
    }
}