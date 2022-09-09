public interface Observavel {
	public void registraObservador (Inimigo observador);
	public void removeObservador (Inimigo observador);
	public void notificaObservador ();
}
