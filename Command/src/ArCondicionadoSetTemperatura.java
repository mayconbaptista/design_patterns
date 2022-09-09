
public class ArCondicionadoSetTemperatura implements Command {
	private ArCondicionado ar;
	
	public ArCondicionadoSetTemperatura (ArCondicionado ar) {
		this.ar = ar;
	}
	
	@Override
	public void execute() {
		this.ar.setTeperatura(22);
	}
}
