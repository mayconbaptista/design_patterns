
public abstract class Operador implements ExpresaoAritmetica{

	private ExpresaoAritmetica Exp1;
	private ExpresaoAritmetica Exp2;
	
	public Operador (ExpresaoAritmetica Exp1, ExpresaoAritmetica Exp2) {
		this.Exp1 = Exp1;
		this.Exp2 = Exp2;
	}

	public ExpresaoAritmetica getOp1 () {
		return this.Exp1;
	}
	
	public ExpresaoAritmetica getOp2 () {
		return this.Exp2;
	}
}
