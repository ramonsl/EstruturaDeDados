import java.util.Scanner;

/**
 * Created by ramon on 18/10/16.
 */
public class Elemento {
    int valor;
    Elemento proximo;


    public void mostrar() {
        System.out.println("valor=" + valor);

    }

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o valor");
        valor=tc.nextInt();
    }
}
