/**
 * Created by ramon on 23/08/16.
 */
class Obj{
    int a;
}

public class FuncaoRef {
    public static void main(String[] args) {
        Obj v = new Obj();
        v.a=5;
        System.out.println("Valor original "+v.a);
        troca(v);
        System.out.println("Valor original "+v.a);

    }

    public static void troca(Obj b){
        b.a=10;
    }
}
