
public class OnForno implements Command{
	private Forno forno;
	
	public OnForno(Forno forno) {
		this.forno = forno;
	}
	
	@Override
	public void execute() {
		this.forno.On();
	}
}
