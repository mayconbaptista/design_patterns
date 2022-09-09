public class Perigo extends Estado{

	public Perigo(Personagem personagem) {
		super(personagem);
		this.getPersonagem().setAtaque(new AtaqueFraco());
		this.getPersonagem().setCorrida(new CorridaLenta());
		this.getPersonagem().setSalto(new SaltoFraco());
		this.setLimits();
	}

	protected void setLimits() {
		this.setLimitInf(0);
		this.setLimitSup(30);
	}
	
	protected void verificaEstado() {
		if(this.getPersonagem().getEnergia() <= this.getLimitInf()) {
			this.getPersonagem().setEstado(new Morto(this.getPersonagem()));
			this.getPersonagem().getEstado().verificaEstado();
		}
		else if(this.getPersonagem().getEnergia() >= this.getLimitSup()) {
			this.getPersonagem().setEstado(new Normal(this.getPersonagem()));
			this.getPersonagem().getEstado().verificaEstado();
		}
		
	}
}
