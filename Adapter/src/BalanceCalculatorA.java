import java.util.Calendar;

public class BalanceCalculatorA implements BalanceCalculator {
	//
	public double calculateBalance(int account, Calendar date){
		System.out.println("account = " + account + ", date = " + date.get(Calendar.DAY_OF_MONTH));
		return 0;
	}
}
