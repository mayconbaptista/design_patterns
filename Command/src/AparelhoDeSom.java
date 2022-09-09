
public class AparelhoDeSom {
	private int volume;
	
	public  void On () {
		System.out.println("Ligar aparelho de som");
	}
	public  void Off () {
		System.out.println("Desligar Aparelho de som");
	}
	
	public void setVolume (int volume) {
		this.volume = volume;
	}
}
