import java.util.Date;

public class BalanceResolverA implements BalanceResolver {
	//
	public double balanceFor(Account account, Date date) {
		System.out.println("account = " + account.getAccount() + ", date = " + date.toString());
		return 0;
	}
	//
}
