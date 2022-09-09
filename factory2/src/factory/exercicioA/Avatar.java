package factory.exercicioA;

public class Avatar {
	private Run velocidade;
	private Jump salto;
	private Attack forca;
	
	Avatar (){}
	
	public void setVelocidade(Run velocidade) {
		this.velocidade = velocidade;
	}
	public Run getVelocidade() {
		return this.velocidade;
	}
	
	public void setSalto(Jump salto) {
		this.salto = salto;
	}
	public Jump getSalto() {
		return this.salto;
	}
	
	public void setForca(Attack forca) {
		this.forca = forca;
	}
	public Attack getForce() {
		return this.forca;
	}
}
