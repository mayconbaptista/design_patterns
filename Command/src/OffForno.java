
public class OffForno implements Command {

	private Forno forno;
	
	public OffForno (Forno forno) {
		this.forno = forno;
	}
	
	@Override
	public void execute() {
		this.forno.Off();
	}
}
