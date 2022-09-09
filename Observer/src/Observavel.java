import java.util.List;

public abstract class Observavel {

	
	private List<Observador> observadores;
	
	public void AddOservador(Observador observador) {
		this.observadores.add(observador);
	}
	
	public abstract void Notifica (Observavel observado);
	public abstract void Remove ()
}
