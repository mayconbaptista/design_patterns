import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BalanceCalculatorB implements BalanceResolver {
	BalanceCalculator balanceCalculator;
	public BalanceCalculatorB (BalanceCalculator balanceCalculator) {
		this.balanceCalculator = balanceCalculator;
	}
	//
	public double balanceFor(Account account, Date date) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(date); 
		balanceCalculator.calculateBalance(account.getAccount(), calendario);
		
		return 0;
	}
	//
} 