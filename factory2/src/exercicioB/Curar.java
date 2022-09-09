package exercicioB;

public class Curar extends Decorator_Personagem{

	public Curar (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("Este persnagem pussui poderes de cura\n");
	}
}

