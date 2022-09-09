package p1exe2;

public class disponivel extends Estado {
	
	disponivel (produto produto){
		super(produto);
		this.setLimits();
	}
	
	protected void setLimits() {
		this.setLimitInferior(11);
		this.setLimitSuperior(2000000000);
	}
	
	public void verificaAlteracaoEstado() {
		if(this.getProduto().getQuantidade() < this.getLimitSuperior()) {
			this.getProduto().setEstado(new estoqueCritico(this.getProduto()));
			this.getProduto().getEstado().verificaAlteracaoEstado();
		}
	}
}
