package ed2;

/**
 * Created by ramon on 09/08/16.
 */
public class BalancoTrimestral {
    public static void main(String[] args) {

        ////Questao 1 e questao 2

        int gastosJaneiro =15000;
        int gastosFev =23000;
        int gastosMar =17000;
        int mediaMensal;
        int gastoTrismestre = gastosFev+gastosJaneiro+gastosMar;
        mediaMensal=gastoTrismestre/3;
        System.out.println("Os gastos foram: "+ gastoTrismestre +" Média mensal: "+mediaMensal );

        //questão 3
        int i=150;
        while (i<300){
            System.out.println(i);
            i++;
        }
        //questão4
        int soma=0;

        for(i=1;i<=1000;i++){
            soma =soma +i;
           // soma +=i; funciona assim tambem
        }
        System.out.println(soma);
        i=0;
         do{
             System.out.println(i);
             i+=3;
         }while (i<100);

    }
}
