package p1exe2;

public class indisponivel extends Estado {
	
	indisponivel (produto Produto){
		super(Produto);
		this.setLimits();
	}
	
	protected void setLimits() {
		this.setLimitInferior(0);
		this.setLimitSuperior(0);
	}
	
	public void venda (int quantidade) {
		System.out.println("Operação indisponivel!");
	}
	
	public void verificaAlteracaoEstado() {
		if(this.getProduto().getQuantidade() > this.getLimitSuperior()) {
			this.getProduto().setEstado(new estoqueCritico(this.getProduto()));
			this.getProduto().getEstado().verificaAlteracaoEstado();
		}
	}
}
