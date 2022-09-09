package exercicioB;


public class Resistencia_Fisica extends Decorator_Personagem{

	public Resistencia_Fisica (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("As resistencia fisicas desse personagem são altas \n");
	}
}