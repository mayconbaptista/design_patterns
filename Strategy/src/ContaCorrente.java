
public class ContaCorrente implements Conta{

	@Override
	public void movimentacao() {
		System.out.println("Movimentação completa opções: caixa eletrônico, cartão de débito, cartão de crédito, homebanking");
		
	}

	@Override
	public void rentabilidade() {
		System.out.println("Rentabilidade baixa");
		
	}

	@Override
	public void mensalidade() {
		System.out.println("Messalidade normal");
		
	}

	@Override
	public void limite() {
		System.out.println("Limite chegue liberado");
		
	}
}
