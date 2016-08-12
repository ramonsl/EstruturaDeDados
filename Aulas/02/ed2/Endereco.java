package ed2;

import java.util.Scanner;

/**
 * Created by ramon on 09/08/16.
 */
public class Endereco {
    String rua;
    int num;
    String cep;
    //String bairro;

   void exibir(){
       System.out.println("...........");
       System.out.println(rua);
       System.out.println(num);
       System.out.println(cep);
   }
    void ler(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a rua");
        rua = teclado.next();
        System.out.println("Digite o numero");
        num = teclado.nextInt();
        System.out.println("Digite o cep");
        cep = teclado.next();

    }



}
