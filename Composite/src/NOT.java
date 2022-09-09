
public class NOT extends OperadorU{

	public NOT(ExpressaoLogica op) {
		super(op);
	}

	@Override
	public boolean operacao() {
		return !super.getOp().operacao();
	}

}
