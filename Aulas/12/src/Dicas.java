/**
 * Created by ramon on 18/10/16.
 */
public class Dicas {
    public void gerarNumeros(){
        int vetor[]= new int[10];
        for (int i=0;i<10;i++){
            Random r= new Random();
            vetor[i]= r.nextInt(10000);
        }

    }
    public  long calcularTempo(){
        long ti ;
        long tf;

        ti = System.currentTimeMillis();
        ///teu algortitmo..
        //quinhetas mil linhas
        tf =System.currentTimeMillis();

        return tf-ti ;

    }

}
