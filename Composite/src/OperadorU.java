
public abstract class OperadorU implements ExpressaoLogica{
	
	private ExpressaoLogica op;

	public OperadorU (ExpressaoLogica op) {
		this.op = op;
	}
	
	public ExpressaoLogica getOp () {
		return this.op;
	}
}
