import java.util.ArrayList;

public class Avatar extends Personagem implements Observavel {
	
	private int cord_x;
	private int cord_y;
	private Escudo escudo;
	private ArrayList <Inimigo> observadores = new ArrayList <Inimigo> ();

	public Avatar(int cord_x,int cord_y) {
		this.setCord_x(cord_x);
		this.setCord_y(cord_y);
		this.escudo = new Escudo();
	}
	
	public int getCord_x() {
		return cord_x;
	}

	public void setCord_x(int cord_x) {
		this.cord_x = cord_x;
	}

	public int getCord_y() {
		return cord_y;
	}
	

	public void setCord_y(int cord_y) {
		this.cord_y = cord_y;
	}

	public void setEscudo(Escudo escudo) {
		if(this.escudo == null)
			this.escudo = escudo;
		else
			this.escudo.setSucessor(escudo);
	}

	public void setPosicao (int cord_x, int cord_y) {
		
        this.setCord_x(cord_x);
        this.setCord_y(cord_y);       
        System.out.println("Posicao da Bola: ("+ this.getCord_x() +","+ this.getCord_y() +")");
	    
	}
	
	public void registraObservador(Inimigo observador) {
		// TODO Auto-generated method stub
		this.observadores.add((Inimigo) observador);
		
	}
	
	public void removeObservador(Inimigo observador) {
		// TODO Auto-generated method stub
		this.observadores.remove(observador);
		
	}

	public void notificaObservador() {
		// TODO Auto-generated method stub
		for(Observador o : this.observadores) {
			o.updade(this);
		}
		
	}
	
	public void atacando () {
		for(Inimigo obs : observadores) {
			
			if((Math.abs(this.getCord_x() - obs.getCord_x()) < 1) && (Math.abs(this.getCord_y() - obs.getCord_y()) < 1)) {
				obs.perdaVida(this.atacar());
				
				if(obs.getEnergia() <= 0) {
					this.removeObservador(obs);
				}
			}
		}
	}

	@Override
	public void perdaVida (int energia){
		System.out.println("dano verdadeiro " + energia);
		int vlr = this.escudo.processaEscudo(energia);
		this.getEstado().perdaVida(vlr);
		System.out.println("Dano causado " + vlr);
	}
	
	public void show () {
		this.notificaObservador();
	}

}
