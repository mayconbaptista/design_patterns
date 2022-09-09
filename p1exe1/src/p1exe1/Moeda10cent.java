package p1exe1;

public class Moeda10cent extends Maquina {

	public void processa (double valor) {
		if(valor == 1.4) {
			System.out.println("Moeda de 10 centavos");
		}
		else if(this.getSucessor() != null) {
			this.getSucessor().processa(valor);
		}
		else if(this.getSucessor() == null) {
			System.out.println("Moeda não reconhecida!");
		}
		
	}
}
