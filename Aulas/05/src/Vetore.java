import java.util.Scanner;

/**
 * Created by ramon on 23/08/16.
 */
public class Vetore {

    public static void main(String[] args) {
        int [] vetor = new int[3];
        int [] vetor2 ={1,2,3};
        int [] vetor3= new int[5];
        vetor[0]=10;
        vetor[1]=12;
        vetor[2]=13;
        Scanner tc = new Scanner(System.in);
        for(int i=0; i<5;i++){
            vetor3[i]=tc.nextInt();
        }


        int somaDoMeuVetor= soma(vetor);
        System.out.println(somaDoMeuVetor);

        System.out.println(soma(vetor2));

        System.out.println(soma(vetor3));

    }
    public static int soma (int[] a){
        int total=0;
        for (int i=0; i<a.length;i++){
            total+=a[i];
        }
        return total;

    }


}
