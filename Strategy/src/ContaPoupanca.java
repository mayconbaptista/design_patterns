
public class ContaPoupanca implements Conta{

	@Override
	public void movimentacao() {
		System.out.println("Movimentação simplificada opções: caixa eletrônico, cartão de débito");
		
	}

	@Override
	public void rentabilidade() {
		System.out.println("rentabilidade normal");
		
	}

	@Override
	public void mensalidade() {
		System.out.println("Mensalidade baixa");
		
	}

	@Override
	public void limite() {
		// TODO Auto-generated method stub
		System.out.println("Limite chegue bloqueado.");
		
	}
}
