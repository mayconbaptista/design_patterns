
public class OnPanelaEletrica implements Command {
	public PanelaEletrica panela;
	
	public OnPanelaEletrica (PanelaEletrica panela) {
		this.panela = panela;
	}

	@Override
	public void execute() {
		this.panela.On();
	}
}
