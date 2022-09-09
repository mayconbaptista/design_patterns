public class CondicaoSE extends  Operacao{

    public  CondicaoSE (Expressao expressao1, Expressao expressao2){
        super(expressao1, expressao2);
    }


    @Override
    public String operacao() {
        return this.getExpressao2().operacao();
    }
}
