
public class FornoSetTemperatura implements Command {
	private Forno forno;
	
	public FornoSetTemperatura (Forno forno) {
		this.forno = forno;
	}
	
	@Override
	public void execute() {
		this.forno.setTemperatura(200);
	}
}
