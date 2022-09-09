public class CondicaoSENao extends  Operacao{

    public CondicaoSENao (Expressao expressao1, Expressao expressao2){
        super(expressao1, expressao2);
    }

    @Override
    public String operacao() {
        if(this.getExpressao1().operacao() == "True")
            return this.getExpressao1().
        else
    }
}
