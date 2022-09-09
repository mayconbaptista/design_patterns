public abstract class Personagem implements Ataque, Salto, Corrida{
	
	private Ataque ataque;
	private Corrida corrida;
	private Salto salto;
	
	private int energia;
	private Estado estado;
	
	public Personagem () {
		this.energia = 70;
		this.estado = new Normal(this);
	}
	
	
	
	public int getEnergia() {
		return energia;
	}



	public void setEnergia(int energia) {
		this.energia = energia;
	}



	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public Ataque getAtaque() {
		return ataque;
	}



	public Corrida getCorrida() {
		return corrida;
	}



	public Salto getSalto() {
		return salto;
	}



	public void setAtaque (Ataque ataque) {
		this.ataque = ataque;
	}
	
	public void setCorrida (Corrida corrida) {
		this.corrida = corrida;
	}
	
	public void setSalto (Salto salto) {
		this.salto = salto;
	}
	
	public int atacar () {
		return this.ataque.atacar();
	}
	
	public int saltar () {
		return this.salto.saltar();
	}
	
	public int correr () {
		return this.corrida.correr();
	}
	
	public void ganhoVida (int energia) {
		this.estado.ganhoVida(energia);
		
		//System.out.println("\n\n############# Ganho de Vida ####################");
		//System.out.println("Quantidade energia ganha = " + energia);
		//System.out.println("Quantidade atual = " + this.getEnergia());
		//System.out.println("Estado Atual  = "+ this.estado.getClass().getName());
		//System.out.println("---------------------------- Fim --------------------------");
		
	}

	public void perdaVida (int energia) {
		this.estado.perdaVida(energia);
		
		//System.out.println("\n\n############# Perda de vida ####################");
		//System.out.println("Quantidade energia perdida = " + energia);
		//System.out.println("Quantidade atual = " + this.getEnergia());
		//System.out.println("Estado Atual  = "+ this.estado.getClass().getName());
		//System.out.println("---------------------------- Fim --------------------------");
	}
}
