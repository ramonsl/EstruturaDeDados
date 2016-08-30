/**
 * Created by ramon on 30/08/16.
 */
public class Pilha {
    int vetor[] = new int[10];
    int topo;

    public void isInit(){
        this.topo=-1;
       // topo=-1;
    }
    public boolean push(int valor){
        if(topo> 9){
            System.out.println("Windows Me");
            return false;
        }
        this.topo++;
        this.vetor[this.topo]= valor;
        System.out.println("Parabens!!");
        return true;
    }
}
