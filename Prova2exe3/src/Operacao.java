public abstract class Operacao implements Expressao {
    private Expressao expressao1;
    private Expressao expressao2;

    public Operacao(Expressao expressao1, Expressao expressao2){
        this.expressao1 = expressao1;
        this.expressao2= expressao2;
    }

    public Expressao getExpressao1() {
        return expressao1;
    }

    public Expressao getExpressao2() {
        return expressao2;
    }
}
