package exercicioB;

public class Montaria extends Decorator_Personagem{

	public Montaria (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("Esse personagem utiliza-se de uma montaria para se locomover\n");
	}
}
