package ed1.ulbra;

import java.util.Scanner;

public class Principal {
    public char varA;

    public static void main(String[] args) {

        char varB;
        Scanner teclado = new Scanner(System.in);

        int varInt;
        long varLong;
        double valorDouble;
       // byte
       // short
       // float
        //double
        /*
        char
        boolean
        */

        System.out.println("Digite o valor" );

        varInt =teclado.nextInt();

        varInt = varInt+1;
        varInt = varInt*10;


        valorDouble = varInt; //promoçao de tipos de dados
        System.out.println("valor: " +valorDouble + " Valor do inteiro");
        valorDouble =10.66;

        varInt = (int)valorDouble; //casting

        System.out.println("valor: " +varInt + " Valor do inteiro");

        if (varInt>10 ){
            char varC;
          
            System.out.printf("MAior que 10");
        }else if(varInt ==10){
            char varC;
            System.out.printf("igual a 10");
        }else{
            System.out.printf("menor que 10");
        }
        switch (varInt){
            case 1:{
                System.out.printf("Variavel 1");
                break;
            }
        }

        for (int i=0;i<varInt;i++){
            System.out.println(i);
        }

    do{
        System.out.println(varInt);
        varInt++;
    }while (varInt<10);

        while (varInt<10){
            varInt++;
            System.out.println(varInt);
        }
        boolean var=true;
        var= !var;

    }
}
