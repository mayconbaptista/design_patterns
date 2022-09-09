import java.util.*;


public class Main {
	public static void main (String [] args) {
		
		
		// Maycon Douglas Batista dos Santos – 11921BSI209, Sávio Dias Araújo - 11921BSI234

		BalanceCalculatorA BCA = new BalanceCalculatorA();
		BalanceResolverA ARA = new BalanceResolverA();
		
		BalanceResolver BCB = new BalanceCalculatorB(BCA);
		
		Account account = new Account();
		
		account.setAccount(6);
		int account2 = 10;
		
		Calendar calendario = Calendar.getInstance();
		Date data = new Date(); 
		
		BCA.calculateBalance(account2, calendario);
		
		BCB.balanceFor(account, data);
	}

}
