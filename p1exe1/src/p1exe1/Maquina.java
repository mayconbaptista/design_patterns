package p1exe1;


// handler
public abstract class Maquina {
	
	private Maquina sucessor;
	
	public void setSucessor(Maquina sucessor) {
		this.sucessor = sucessor;
	}
	public Maquina getSucessor() {
		return this.sucessor;
	}
	
	public abstract void processa (double valor);
}
