
public class ContaSalario implements Conta{
	
	@Override
	public void movimentacao() {
		// TODO Auto-generated method stub
		System.out.println("Movimentação Simplificada opções: caixa eletrônico, cartão de débito");
		
	}

	@Override
	public void rentabilidade() {
		// TODO Auto-generated method stub
		System.out.println("Rentabilidade Baixa");
	}

	@Override
	public void mensalidade() {
		// TODO Auto-generated method stub
		System.out.println("Mensalidade normal");
	}

	@Override
	public void limite() {
		// TODO Auto-generated method stub
		System.out.println("Limite chegue bloaqueado");
		
	}
}
