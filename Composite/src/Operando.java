
public class Operando implements ExpressaoLogica{
	
	private boolean bool;
	
	public Operando (boolean bool) {
		this.bool = bool;
	}

	@Override
	public boolean operacao() {
		return this.bool;
	}
}
