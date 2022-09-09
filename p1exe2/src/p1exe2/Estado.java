package p1exe2;

// implementação da logica de transição de estado
public abstract class Estado {
	
	private produto Produto;
	private int limitInferior;
	private int limitSuperior;
	
	public Estado (produto Produto){
		this.Produto = Produto;
	}
	protected void setProduto(produto Produto) {
		this.Produto = Produto;
	}
	protected produto getProduto() {
		return this.Produto;
	}
	protected void setLimitInferior(int limitInferior) {
		this.limitInferior = limitInferior;
	}
	protected int getLimitInferior() {
		return this.limitInferior;
	}
	protected void setLimitSuperior(int limitSuperior) {
		this.limitSuperior = limitSuperior;
	}
	protected int getLimitSuperior() {
		return this.limitSuperior;
	}
	
	protected abstract void setLimits();
	
	public void reposicao (int quantidade) {
		this.Produto.setQuantidade(this.Produto.getQuantidade() + quantidade);
		this.verificaAlteracaoEstado();
	}
	public void venda (int quantidade) {
		if(quantidade >= this.Produto.getQuantidade())
			quantidade = this.Produto.getQuantidade(); // não pode ficar indisponivel
		
		this.Produto.setQuantidade(this.Produto.getQuantidade() - quantidade);
		this.verificaAlteracaoEstado();
	}
	
	protected abstract void verificaAlteracaoEstado();
	
}
