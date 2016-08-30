/**
 * Created by ramon on 30/08/16.
 * Escreva uma uma função para mostrar se o
 * numero é par. Se for par a função deve retornar 0, caso contrario 1
 */
public class Ex03 {

    public static void main(String[] args) {
        System.out.println(isPar(5));
        System.out.println(isPar(6));

    }

    public static int isPar(int n){
        if (n%2==0){
            System.out.println("numero par");
            return 0;
        }else{
            System.out.println("numero impar");
            return 1;
        }

    }
}
