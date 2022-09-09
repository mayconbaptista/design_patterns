
public class OnAparelhoDeSom implements Command {

	public AparelhoDeSom aparelho;
	
	public OnAparelhoDeSom (AparelhoDeSom aparelho) {
		this.aparelho = aparelho;
	}
	
	@Override
	public void execute() {
		this.aparelho.On();
	}
}
