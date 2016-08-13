package Atividade;

import java.util.Scanner;

/**
 * Created by ramon on 12/08/16.
 */
public class Ex2 {
    public static void main(String[] args) {
        /*
        *
    1.	Faça um programa que leia um vetor unidimensional de tamanho 10, a leitura deve ser encerrada ao
    atingir o tamanho do vetor ou o usuário digitar 0. Ao final da leitura mostrar a soma do vetor e a média dos valores lidos.

        * */

        //write your code here
        Scanner tc = new Scanner(System.in); // obj para leitura
        int vet[] = new int[10]; //declarando um vetor
        int soma=0;
        int i;

        for (i=0; i<9; i++){   // tam =10 o vetor inicia em 0 ate 9.. diferente de do C acessar vet[10] gera erro catastrofico
            int valor; // variavel temporaria pra leitura e validação
            System.out.println("Digite o valor de :"+i);
                valor =tc.nextInt();
            if(valor==0) {
                break;
            }
            vet[i]=valor;
            soma+=vet[i];
            }

            System.out.println("Soma vetor:"+ soma );

            System.out.println("Media vetor:"+ soma/i );

    }



    }
