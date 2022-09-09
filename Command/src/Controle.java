
public class Controle {
	private Command slot[]  = new Command[11];
	
	public Controle() {
		
	}
	
	public void setCommand ( Command comando, int pos) {
		this.slot[pos] = comando;
	}
	
	public void PressBTN (int pos) {
		this.slot[pos].execute();
	}
}
