
public class Forno {
	private int temperatura;
	private int timer;
	
	public void On () {
		System.out.println("Forno ligado");
	}
	
	public void Off () {
		System.out.println("Forno desligado");
	}
	
	public void setTemperatura (int temperatura) {
		this.temperatura = temperatura;
		System.out.println("Temperatura setada com " + temperatura);
	}
	
	public void setTimer (int timer) {
		this.timer = timer;
		System.out.println("Timer setado com " + timer);
	}
}
