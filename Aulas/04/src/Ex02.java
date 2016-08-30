/**
 *
 * Fazer uma função que conte o numero de vogais numa
 * string passada por parâmetro. Fazer a chamada no main.
 * A função deve retornar a quantidade de vogais.
 *
 * Created by ramon on 30/08/16.
 */
class Consoantes{
    int nConsoante;
}

public class Ex02 {
    public static void main(String[] args) {

        int nConsoantes=0;


        String frase="MinhA Frase";
        System.out.println("Quantidade de vogais : "+ contaVogais(frase));
        System.out.println("Quantidade de consoantes : "+ contaOutrosCaracteres(frase));
        nConsoantes =contaOutrosCaracteres(frase);
        System.out.println(nConsoantes);

        Consoantes n2Consoantes= new Consoantes();
        System.out.println(n2Consoantes.nConsoante);

    }

    public static int contaVogais(String palavra){
        palavra = palavra.toUpperCase(); // converter todos para maiuscula
        int cont=0;
        for(int i=0; i<palavra.length(); i++){
            if (palavra.charAt(i)=='A'  ||palavra.charAt(i)=='E' || palavra.charAt(i)=='I' || palavra.charAt(i)=='O' || palavra.charAt(i)=='U'){
                cont++;
            }
        }
        return cont;
    }
    public static int contaOutrosCaracteres(String palavra){
        return palavra.length()-contaVogais(palavra);
    }
    public static void contaOutrosCaracteres(String palavra, Consoantes n){
        n.nConsoante= palavra.length()-contaVogais(palavra);
    }
}
