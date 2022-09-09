public class Morto extends Estado{

	public Morto(Personagem personagem) {
		super(personagem);
		this.setLimits();
	}

	protected void setLimits() {
		this.setLimitInf(0);
		this.setLimitSup(0);
	}
	
	public void verificaEstado() {
		
	}
}
