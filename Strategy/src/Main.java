
public class Main {

	public static void main(String[] args) {
		
		/* Integrantes
		 * Maycon douglas batista dos santos | matricula: 11921BSI209
		 * Sávio dias araújo | matricula: 11921BSI234
		 */
		
		Conta minhaConta = new ContaCorrente ();
		
		System.out.println(minhaConta.getClass().getName());
		minhaConta.movimentacao();
		minhaConta.mensalidade();
		minhaConta.rentabilidade();
		System.out.println("\n ************************************************ \n");
		
		minhaConta = new ContaPoupanca ();
		
		System.out.println(minhaConta.getClass().getName());
		minhaConta.movimentacao();
		minhaConta.mensalidade();
		minhaConta.rentabilidade();
		System.out.println("\n ************************************************ \n");

		minhaConta = new ContaSalario ();
		
		System.out.println(minhaConta.getClass().getName());
		minhaConta.movimentacao();
		minhaConta.mensalidade();
		minhaConta.rentabilidade();
		System.out.println("\n ************************************************ \n");
		
		minhaConta = new ContaInvestimento();
		
		System.out.println(minhaConta.getClass().getName());
		minhaConta.movimentacao();
		minhaConta.mensalidade();
		minhaConta.rentabilidade();
		System.out.println("\n ************************************************ \n");
	}
}
