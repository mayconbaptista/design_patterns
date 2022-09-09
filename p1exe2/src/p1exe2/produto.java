package p1exe2;


// a minha classe contex
public class produto {
	private int quantidade;
	private Estado estado;
	
	produto (){
		this.quantidade = 0;
		this.estado = new indisponivel(this);
	}
	
	public void venda (int quantidade) {
		this.estado.venda(quantidade);
		
		System.out.println("\n\n############# Operação de Venda #######################");
		System.out.println("Quantidade reposição = " + quantidade);
		System.out.println("Quantidade atual = " + this.getQuantidade());
		System.out.println("Estado Atual  = "+ this.estado.getClass().getName());
		System.out.println("----------------------------fim venda--------------------------");
	}
	public void reposicao (int quantidade) {
		this.estado.reposicao(quantidade);
		
		System.out.println("\n\n############# Operação de Reposição ####################");
		System.out.println("Quantidade reposição = " + quantidade);
		System.out.println("Quantidade atual = " + this.getQuantidade());
		System.out.println("Estado Atual  = "+ this.estado.getClass().getName());
		System.out.println("----------------------------fim reposição--------------------------");
	}
	
	protected void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	protected int getQuantidade() {
		return this.quantidade;
	}
	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	protected Estado getEstado() {
		return this.estado;
	}
}
