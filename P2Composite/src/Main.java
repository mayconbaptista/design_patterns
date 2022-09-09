
public class Main {

		public static void main (String [] args) {
			
			ExpresaoAritmetica exp = new Operando(2);
			System.out.println(exp.operacao());
			
			ExpresaoAritmetica sum = new Soma(new Operando(5),new Operando(2));
			System.out.println(sum.operacao());
		}
}
