
// leaf (folha)
public class Elemento implements Expressao {
    private String codigotxt;

    public Elemento(String codigotxt){
        this.codigotxt = codigotxt;
    }

    @Override
    public String operacao() {
        return this.codigotxt;
    }
}
