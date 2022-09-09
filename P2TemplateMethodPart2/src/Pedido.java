
public abstract class Pedido {
	
	public final boolean processa () {
		calculaDesconto();
		calculaFrete();
		calculaComissãoVendedor();
		finalizaPedido();
		despachar();
	}

}
