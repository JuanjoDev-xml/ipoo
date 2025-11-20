public class Gama extends Delta{
    int v1 (Beta a){
        return a.f() * a.h();
    }
    int v2 (Alfa a){
        return a.f() * a.g();
    }
}
