package exercicioB;

public class Resistencia_Magica extends Decorator_Personagem{

	public Resistencia_Magica (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("possui resistencia elevadas a ataque magicos\n");
	}
}
