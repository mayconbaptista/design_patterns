
public class OnArCondicionado implements Command{

	private ArCondicionado ar;
	
	public OnArCondicionado(ArCondicionado ar) {
		this.ar = ar;
	}
	
	@Override
	public void execute() {
		this.ar.On();
	}
}
