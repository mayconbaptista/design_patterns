
public class Soma extends Operador{

	public Soma (ExpresaoAritmetica op1, ExpresaoAritmetica op2) {
		super(op1, op2);
	}
	
	public int operacao () {
		return (super.getOp1().operacao() + super.getOp2().operacao());
	}
}
