import java.util.Scanner;

/**
 * Created by ramon on 18/10/16.
 */
public class Main {
    public static void main(String[] args) {
        Lista minhaLista = new Lista();
        Scanner tc = new Scanner(System.in);
        int op=0;
        do{
            System.out.println("1 - Add no inicio");
            System.out.println("2 - Add no fim");
            System.out.println("3 - Add numa posicao");
            System.out.println("4 - Del no inicio");
            System.out.println("4 - Del na posicao");
            System.out.println("5 - Del no fim");
            System.out.println("6 - Listar");
            System.out.println("4 - Buscar elemento");
            op=tc.nextInt();
            switch (op){
                case 1:{
                    Elemento a = new Elemento();
                    a.ler();
                    minhaLista.addInicio(a);
                    break;
                }
                case 2:{
                    Elemento a = new Elemento();
                    a.ler();
                    minhaLista.addFim(a);
                    break;
                }
                case 3:{
                    System.out.println("mostrar ");
                    System.out.println(minhaLista.toString());
                    break;
                }
            }


        }while (op!=0);


    }
}
