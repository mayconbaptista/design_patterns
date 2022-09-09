package p1exe3;

public abstract class FormDecorator extends Forma{
	private Forma formDecorator;
	
	public FormDecorator(Forma formDecorator) {
		this.formDecorator = formDecorator;
	}
	
	public String desenhar () {
		return this.formDecorator.desenhar() + " , " + super.desenhar();
	}
}
