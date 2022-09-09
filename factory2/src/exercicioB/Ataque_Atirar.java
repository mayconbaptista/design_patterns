package exercicioB;

public class Ataque_Atirar extends Decorator_Personagem{

	public Ataque_Atirar (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("A forma de ataque desse personagem e atirar\n");
	}
}