/**
 * Created by ramon on 23/08/16.
 */
public class Ex2 {

    public static void main(String[] args) {
        String valor="RAmon";
        System.out.println("Numero de vogais "+ contVogais(valor));
    }

    public static int contVogais(String nome){


        nome=nome.toLowerCase();

        int cont =0;
        for(int i=0; i<nome.length();i++){
            char comp=nome.charAt(i);
            if('a'==comp ||'e'==comp ||'i'==comp ||'o'==comp ||'u'==comp  ){
                cont++;
            }

        }
        return cont;

    }
}
