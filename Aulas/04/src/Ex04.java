import java.util.Scanner;

/**
 * Created by ramon on 30/08/16.
 * Faça uma função que some dois números,
 * entretanto a função deve garantir que o
 * primeiro argumento é um numero par e
 * o segundo um numero impar
 */
public class Ex04 {
    public static void main(String[] args) {
       int n1, n2;
        Scanner tc = new Scanner(System.in);
        do{
            System.out.println("Digite o valor do primero parametro");
            n1=tc.nextInt();

        }while (Ex03.isPar(n1)==1);

        do{
            System.out.println("Digite o valor do segundo parametro");
            n2=tc.nextInt();

        }while (Ex03.isPar(n2)==0);
        System.out.println(soma(n1, n2));

    }
    public static int soma(int a, int b){
        return a+b;
    }

}
