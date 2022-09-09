
public class OffAparelhoDeSom implements Command{
	private AparelhoDeSom aparelho;
	
	public OffAparelhoDeSom (AparelhoDeSom aparelho)
	{
		this.aparelho = aparelho;
	}

	@Override
	public void execute() {
		this.aparelho.Off();
	}
}
