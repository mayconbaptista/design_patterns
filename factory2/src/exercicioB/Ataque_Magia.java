package exercicioB;

public class Ataque_Magia extends Decorator_Personagem{

	public Ataque_Magia (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("A forma de ataque desse personagem e com magia\n");
	}
}