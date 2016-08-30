/**
 * Created by ramon on 23/08/16.
 */
class Consoantes{
    int n;
}

public class Ex4 {

    public static void main(String[] args) {
        int a=10; /// passagem por valor
        contar(a);/// passagem por valor
        System.out.println(a);/// passagem por valor

        Consoantes nConsoantes = new Consoantes(); /// passagem por ref
        nConsoantes.n=10;/// passagem por ref
        contar(nConsoantes);/// passagem por ref
        System.out.println(nConsoantes.n);/// passagem por ref
    }
    public  static void contar(int n){
        n =100;
    }

    public  static void contar(Consoantes n){
        n.n =100;
    }
}
