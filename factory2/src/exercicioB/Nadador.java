package exercicioB;

public class Nadador extends Decorator_Personagem{

	public Nadador (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("Esse personagem e otimo nadador\n");
	}
}
