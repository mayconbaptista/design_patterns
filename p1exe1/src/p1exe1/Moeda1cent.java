package p1exe1;

public class Moeda1cent extends Maquina {
	
	public void processa (double valor) {
		if(valor == 0.01) {
			System.out.println("Moeda de 1 centavo");
		}
		else if(this.getSucessor() != null) {
			this.getSucessor().processa(valor);
		}
		else if(this.getSucessor() == null) {
			System.out.println("Moeda não reconhecida! ");
		}
	}
}
