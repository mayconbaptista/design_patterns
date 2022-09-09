
public class AparelhoDeSomSetVolume implements Command  {
	private AparelhoDeSom aparelho;
	
	public AparelhoDeSomSetVolume (AparelhoDeSom aparelho) {
		this.aparelho = aparelho;
	}
	
	@Override
	public void execute() {
		this.aparelho.setVolume(20);
		System.out.println("Aparelho de som com volume de 20");
	}
	
}
