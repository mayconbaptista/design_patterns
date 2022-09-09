public abstract class Dinheiro{
    protected Dinheiro next;
    protected int valor;

    public Dinheiro (int v) {
        next = null;
        valor = v;
    }
    public void setNext(Dinheiro quantia) {
        if(next == null) {
            next = quantia;
        } else{
            next.setNext(quantia);
        }
    }
    protected abstract void sacar(int quantia);
}