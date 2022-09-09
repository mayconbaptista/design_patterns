public abstract class Estado {

	private int limitSup;
	private int limitInf;
	private Personagem personagem;
	
	public Estado (Personagem personagem){
		this.personagem = personagem;
	}
	


	public int getLimitSup() {
		return limitSup;
	}



	public void setLimitSup(int limitSup) {
		this.limitSup = limitSup;
	}



	public int getLimitInf() {
		return limitInf;
	}



	public void setLimitInf(int limitInf) {
		this.limitInf = limitInf;
	}



	public Personagem getPersonagem() {
		return personagem;
	}



	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public void ganhoVida (int energia) {
		this.personagem.setEnergia(this.personagem.getEnergia() + Math.abs(energia));
		this.verificaEstado();
		
	}

	public void perdaVida (int energia) {
		if((this.personagem.getEnergia() - Math.abs(energia)) <= 0)
			this.personagem.setEnergia(0);
		else
			this.personagem.setEnergia(this.personagem.getEnergia() - Math.abs(energia));
		this.verificaEstado();
	}

	protected abstract void verificaEstado();
	protected abstract void setLimits();
}
