public class Forte extends Estado{
	
	public Forte (Personagem personagem) {
		super(personagem);
		this.getPersonagem().setAtaque(new AtaqueForte());
		this.getPersonagem().setCorrida(new CorridaRapida());
		this.getPersonagem().setSalto(new SaltoForte());
		this.setLimits();
	}

	protected void verificaEstado() {
		if(this.getPersonagem().getEnergia() <= this.getLimitInf()) {
			this.getPersonagem().setEstado(new Normal(this.getPersonagem()));
			this.getPersonagem().getEstado().verificaEstado();
		}
	}

	protected void setLimits() {
		this.setLimitInf(70);
		this.setLimitSup((int) Math.pow(2, 32));
	}
}
