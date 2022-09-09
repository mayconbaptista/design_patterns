
public class FornoSetTimer implements Command{

	private Forno forno;
	
	public FornoSetTimer (Forno forno) {
		this.forno = forno;
	}
	
	@Override
	public void execute() {
		this.forno.setTimer(30);
	}	
}
