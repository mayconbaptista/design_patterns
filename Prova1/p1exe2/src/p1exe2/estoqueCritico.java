package p1exe2;

public class estoqueCritico extends Estado{
	
	estoqueCritico (produto Produto){
		super(Produto);
		this.setLimits();
		this.verificaAlteracaoEstado();
	}
	
	protected void setLimits() {
		this.setLimitInferior(1);
		this.setLimitSuperior(10); // limit int 
	}
	
	public void venda (int quantidade) {
		if(quantidade >= this.getProduto().getQuantidade())
			quantidade = this.getProduto().getQuantidade(); // não pode ficar indisponivel
		
		System.out.println("Produto com estoque critico resposição nescessária!");
		this.getProduto().setQuantidade(this.getProduto().getQuantidade() - quantidade);
		this.verificaAlteracaoEstado();
	}// ???
	
	public void verificaAlteracaoEstado() {
		if(this.getProduto().getQuantidade() > this.getLimitSuperior()){
			this.getProduto().setEstado(new disponivel(this.getProduto()));
		}
		else if(this.getProduto().getQuantidade() < this.getLimitInferior()) {
			this.getProduto().setEstado(new indisponivel(this.getProduto()));
		}
	}
}
