package exercicioB;

public class Saltador extends Decorator_Personagem{

	public Saltador (Personagem decorator_personagem) {
		super(decorator_personagem);
		setAtributos("Conseque saltos em longas distancias\n");
	}
}
