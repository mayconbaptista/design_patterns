public class Normal extends Estado{

	public Normal (Personagem personagem) {
		super(personagem);
		this.getPersonagem().setAtaque(new AtaqueMedio());
		this.getPersonagem().setCorrida(new CorridaMedia());
		this.getPersonagem().setSalto(new SaltoMedio());
		this.setLimits();
	}
	
	protected void setLimits() {
		this.setLimitInf(30);
		this.setLimitSup(70);
	}

	protected void verificaEstado() {
		if(this.getPersonagem().getEnergia() < this.getLimitInf()) {
			this.getPersonagem().setEstado(new Perigo(this.getPersonagem()));
			this.getPersonagem().getEstado().verificaEstado();
		}
		else if(this.getPersonagem().getEnergia() > this.getLimitSup()) {
			this.getPersonagem().setEstado(new Forte(this.getPersonagem()));
			this.getPersonagem().getEstado().verificaEstado();
		}
		
	}
}
