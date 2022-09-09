
public class ContaInvestimento implements Conta {


	@Override
	public void movimentacao() {
		System.out.println("Movimentação completa opções: caixa eletrônico, cartão de débito, cartão de crédito, homebanking");
		
	}

	@Override
	public void rentabilidade() {
		System.out.println("Rentabilidade Normal");
		
	}

	@Override
	public void mensalidade() {
		System.out.println("Mensalidade baixa");
		
	}

	@Override
	public void limite() {
		// TODO Auto-generated method stub
		System.out.println("Limite chegue liberado");
		
	}
	
}
