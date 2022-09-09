
public class OffArCondicionado implements Command{
	private ArCondicionado ar;
	
	public OffArCondicionado(ArCondicionado ar) {
		this.ar = ar;
	}
	
	@Override
	public void execute() {
		this.ar.Off();
	}
}
