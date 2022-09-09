
public class OR extends Operador{
	
	public OR (ExpressaoLogica op1, ExpressaoLogica op2) {
		super(op1, op2);
	}

	@Override
	public boolean operacao() {
		return (super.getOp1().operacao() || super.getOp2().operacao());
	}
}
