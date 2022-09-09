
public class Main {

	public static void main(String[] args) {
		ExpressaoLogica e = new AND(new AND(new Operando(true), new XOR(new Operando(false), new Operando(true))), new NOT(new Operando(false)));   
		System.out.println("Expressão1  -> " + e.operacao());
		
		ExpressaoLogica e1 = new NOT(new Operando(true));
		System.out.println("Expressão2  -> " + e1.operacao());
	}

}
