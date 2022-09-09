package p1exe1;

public class Moeda50cent extends Maquina {

	public void processa (double valor) {
		if(valor == 1.6) {
			System.out.println("Moeda de 50 centavos");
		}
		else if(this.getSucessor() != null) {
			this.getSucessor().processa(valor);
		}
		else if(this.getSucessor() == null) {
			System.out.println("Moeda não reconhecida! ");
		}
	}
}
