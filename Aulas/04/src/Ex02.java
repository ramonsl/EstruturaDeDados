/**
 *
 * Fazer uma função que conte o numero de vogais numa
 * string passada por parâmetro. Fazer a chamada no main.
 * A função deve retornar a quantidade de vogais.
 *
 * Created by ramon on 30/08/16.
 */
public class Ex02 {
    public static void main(String[] args) {

        String vogais="Minha Frase";
        System.out.println("Quantidade de vogais : "+ contaVogais(vogais));

    }

    public static int contaVogais(String palavra){
        palavra = palavra.toUpperCase(); // converter todos para maiuscula
        int cont=0;
        for(int i=0; i<palavra.length(); i++){
            if (palavra.charAt(i)=='A' ||palavra.charAt(i)=='E' || palavra.charAt(i)=='I' || palavra.charAt(i)=='O' || palavra.charAt(i)=='U'){
                cont++;
            }
        }
        return cont;
    }
}
