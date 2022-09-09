package exercicioB;

public class Ataque_corpoACorpo extends Decorator_Personagem{

	public Ataque_corpoACorpo (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("A forma de ataque desse personagem e copo a corpo\n");
	}
}