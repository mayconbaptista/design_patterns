
public class ConcreteDinheiro extends Dinheiro {

	public ConcreteDinheiro(int v) {
		super(v);
	}
	// método privado que ejeta o dinheiro
    private void ejetaNotas(int numDeNotas) {
        System.out.println(numDeNotas + " notas de R$" + this.valor);
    }
    protected void sacar(int quantia) {
        int numDeNotas = (int) Math.floor(quantia / this.valor);
        if (numDeNotas > 0) {
            // Ejeta as notas
            this.ejetaNotas(numDeNotas);
            // Encolher o valor por quanto dinheiro ejetamos
            quantia = quantia - (this.valor * numDeNotas);
        }
        // Se sobrar algum dinheiro para sacar e se tivermos outra pilha na fila, passe o pedido adiante
        if(quantia > 0 && this.next != null){
            this.next.sacar(quantia);
        }
    }
}
