package Atividade;

import java.util.Scanner;

/**
 * Created by ramon on 12/08/16.
 */
public class Ex4 {

    ////1.	Faca um programa que leia um vetor de 5 elementos, apos a leitura os valores devem ser copiados para um novo vetor, na ordem inversa.

    public static void main(String[] args) {
        int vet[] = new int[5];
        int inv[] = new int[5];

        Scanner tc = new Scanner(System.in); // obj para leitura

        for (int i=0; i<5; i++){
            int valor; // variavel temporaria pra leitura e validação
            System.out.println("Digite o valor de :" + i);
            vet[i] = tc.nextInt();
        }

        int j=4;
        int i=0;
        for (i=0; i<5; i++){
            inv[j] = vet[i];
            j--;
        }
        for(i=0;i<5;i++){
            System.out.println(inv[i]);
        }

}}
