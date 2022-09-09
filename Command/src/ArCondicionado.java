
public class ArCondicionado {
	private int temperatura;
	
	
	public void setTeperatura(int tempetatura) {
		this.temperatura = temperatura;
		System.out.println("Teperatura setada com " + this.temperatura);
	}
	
	public void On () {
		System.out.println("Ligar ar condicionado");
	}
	
	public void Off () {
		System.out.println("Desligar ar condicionado");
	}
}
