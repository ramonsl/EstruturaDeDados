package Atividade;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        /*
        * 1.	Faça um programa que leia um vetor unidimensional de tamanho 10, aonde os valores devem ser
         * entre 1 e 10. Ao final da leitura mostrar a soma do vetor. Mostrar o menor elemento lido e o maior.
        * */




        Scanner tc = new Scanner(System.in); // obj para leitura
        int vet[] = new int[10]; //declarando um vetor
        int soma=0, maior=0, menor=0;

        for (int i=0; i<9; i++){   // tam =10 o vetor inicia em 0 ate 9.. diferente de do C acessar vet[10] gera erro catastrofico
            int valor; // variavel temporaria pra leitura e validação
            System.out.println("Digite o valor de :"+i);
            do{

                valor =tc.nextInt();
                vet[i]=valor;
            }while (valor >10 || valor < 1 ); //enquanto verdadeiro fica no laço

            soma+=vet[i];
            if(i==0){
                maior=vet[i];
                menor=vet[i];
            }else{
                if(vet[i]>maior){
                    maior=vet[i];
                }
                if(vet[i]<menor){
                    menor=vet[i];
                }
            }

        }
        System.out.println("Maior valor:"+ maior );
        System.out.println("Menor valor:"+ menor );
        System.out.println("Soma vetor:"+ soma );





    }
}
