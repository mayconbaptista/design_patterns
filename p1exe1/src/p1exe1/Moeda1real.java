package p1exe1;

public class Moeda1real extends Maquina{

	public void processa (double valor) {
		if(valor == 1.8) {
			System.out.println("Moeda de 1 real");
		}
		else if(this.getSucessor() != null) {
			this.getSucessor().processa(valor);
		}
		else if(this.getSucessor() == null) {
			System.out.println("Moeda não reconhecida! ");
		}
	}
}
