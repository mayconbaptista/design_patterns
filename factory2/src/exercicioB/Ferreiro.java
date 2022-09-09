package exercicioB;

public class Ferreiro extends Decorator_Personagem{

	public Ferreiro (Personagem decorator_personagem) {
		super(decorator_personagem);
		this.setAtributos("Esse personagem pode fabricar armas para seu uso\n");
	}
}
