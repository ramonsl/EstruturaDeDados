/**
 * Created by ramon on 18/10/16.
 */
public class Lista {
    Elemento inicio;
    int qtd;
    Elemento fim;

    @Override
    public String toString() {
        return "Lista{" +
                "inicio=" + inicio +
                ", qtd=" + qtd +
                ", fim=" + fim +
                '}';
    }

    public boolean addPrimeiroElemento(Elemento e){
        this.inicio=e;
        this.qtd++;
        this.fim = this.inicio;
        //   this.fim=e;
        return true;
    }
    public boolean addFim(Elemento e){
        if(this.inicio ==null){
            return addPrimeiroElemento(e);

        }else{
            this.fim.proximo =e;
            this.qtd++;
            this.fim=e;
            return true;
        }
    }

    public boolean addInicio(Elemento e){
        if(this.inicio == null){
           return addPrimeiroElemento(e);
        }else{
            e.proximo =this.inicio;
            this.qtd++;
            this.inicio =e;
            return true;
        }
    }

}
