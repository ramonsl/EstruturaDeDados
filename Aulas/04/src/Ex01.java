/**
 *
 * Criar uma função que some os elementos
 * de um vetor recebidos por parâmetro.
 * Fazer a chamada no main. -
 * A função deve retornar a soma do valor
 * Created by ramon on 30/08/16.
 */
public class Ex01 {

    public static void main(String[] args) {
        int[] ve5 = {5,5,5,5,5};
        int[] ve6 = {5,5,5,5,5,5};
        int[] ve7 = {5,5,5,5,5,5,5};
        int[] ve4 = {5,5,5,5};
        int total =somaVetor(ve4);
        System.out.println("Vetor com "+ve4.length + " Elemento "+ total);
        System.out.println("Vetor com "+ve5.length + " Elemento "+ somaVetor(ve5)); // como return podemos printar diretamente no sout
        System.out.println("Vetor com "+ve6.length + " Elemento "+somaVetor(ve6));
        System.out.println("Vetor com "+ve7.length + " Elemento "+ somaVetor(ve7));


    }

    public static int somaVetor(int[] vet ){
        int som=0;
        for(int i=0; i<vet.length;i++){
            som += vet[i];
        }
        return som;
    }
}

