package Atividade;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        /*
        *
        * 1.	Faça um programa que leia um vetor de 10 elementos, o
        * vetor deve aceitar na primeira leitura apenas valores entre 1 e 3.
        * Nas leituras subsequentes o valor deve ser maior ao seu antecessor.

        * */

	//write your code here
        Scanner tc = new Scanner(System.in); // obj para leitura
        int vet[] = new int[10]; //declarando um vetor
        int i=0;
        int valor;
        do{
            System.out.println("Digite o valor de :"+i);
            valor =tc.nextInt();
            vet[i]=valor;
        }while (valor >3 || valor < 1 ); //enquanto verdadeiro fica no laço


        for (i=1; i<9; i++){   // tam =10 o vetor inicia em 0 ate 9.. diferente de do C acessar vet[10] gera erro catastrofico
                do{
                    System.out.println("Digite o valor de :"+i);
                    valor =tc.nextInt();
                }while ( vet[i-1] >= valor);
            vet[i]=valor;

        }

        for(i=0;i<9;i++){
            System.out.println(vet[i]);
        }




    }
}
