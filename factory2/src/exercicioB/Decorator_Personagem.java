package exercicioB;

public abstract class Decorator_Personagem extends Personagem{
	
	private Personagem decorator_personagem;

	public Decorator_Personagem (Personagem decorator_personagem) {
		this.decorator_personagem = decorator_personagem;
	}
	
	public String desenhar () {
		return this.decorator_personagem.getAtributos() + super.getAtributos();
	}
}
