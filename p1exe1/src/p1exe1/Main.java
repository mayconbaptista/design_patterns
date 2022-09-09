package p1exe1;

public class Main {

	public static void main(String[] args) {
		
		// instanciar objetos
		Maquina moeda1cent = new Moeda1cent();
		Maquina moeda5cent = new Moeda5cent();
		Maquina moeda10cent = new Moeda10cent();
		Maquina moeda50cent = new Moeda50cent();
		Maquina moeda1real = new Moeda1real();
		
		// criar cadeira "lista encadeada"
		moeda1real.setSucessor(moeda50cent);
		moeda50cent.setSucessor(moeda10cent);
		moeda10cent.setSucessor(moeda5cent);
		moeda5cent.setSucessor(moeda1cent);
		
		// testando
		moeda1real.processa(1.8);
		moeda1real.processa(1.6);
		moeda1real.processa(1.4);
		moeda1real.processa(0.02);// err
		moeda1real.processa(1.2);
		moeda1real.processa(0.01);
	}
}
