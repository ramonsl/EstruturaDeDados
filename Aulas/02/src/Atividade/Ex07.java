package Atividade;

import java.util.Scanner;

/**
 * Created by ramon on 16/08/16.
 */
public class Ex07 {
/*
    marca: string
    ano: inteiro
    cor: string
    preço: real
    a) Escrever a definição da estrutura carro. OK
    b) Declarar o vetor vetcarros do tipo da estrutura
    definida acima, de tamanho 20 e global. OK
    Crie um menu para:
    c) Definir um bloco de programa para ler o vetor vetcarros.
    d) Definir um bloco de programa que receba um preço e imprima os carros (marca, cor e ano) que tenham preço igual ou menor ao preço recebido.
    e) Defina um bloco de programa que leia a marca de um carro e imprima as informações de todos os carros dessa marca (preço, ano e cor).
    f) Defina um bloco de programa que leia uma marca, ano e cor e informe se existe ou não um carro com essas características. Se existir, informar o preço.
*/
    static Carro vetCarros[] = new Carro[20];

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int op=0;
        int qtd=0;
        do{
            System.out.println("Digite 1 pra add");
            System.out.println("Digite 2 para mostrar carro");
            System.out.println("Digite 3 para mostrar carro pela marcar");
            System.out.println("Digite 4 para ver se existe o carro");
                op=tc.nextInt();
            switch (op){
                case 1:{

                        Carro c= new Carro();
                        System.out.println("Ano:");
                        c.ano = tc.nextInt();
                        System.out.println("Cor:");
                        c.cor= tc.next();
                        System.out.println("Preco:");
                        c.preco= tc.nextDouble();
                        System.out.println("Marca:");
                        c.marca= tc.next();
                        vetCarros[qtd]=c;
                        qtd++;

                    break;

                }
                case 2:{
                    System.out.println("Numero de carros "+ qtd);
                    break;

                }
            }

        }while (op!=0);

    }

}
