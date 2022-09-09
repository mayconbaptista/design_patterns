package p1exe1;

public class Moeda5cent extends Maquina{
	public void processa (double valor) {
		
		if(valor == 1.2) {
			System.out.println("Moeda de 5 centavos");
		}
		else if(this.getSucessor() != null) {
			this.getSucessor().processa(valor);
		}
		else if(this.getSucessor() == null) {
			System.out.println("Moeda não reconhecida! ");
		}
	}
}
