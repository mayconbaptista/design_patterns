
public class Operando implements ExpresaoAritmetica  {
	private int conteudo;

	public Operando(int conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public int operacao() {
		return this.conteudo;
	}
}
