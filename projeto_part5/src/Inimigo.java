public class Inimigo extends Personagem implements Observador{
	
	private int cord_x;
	private int cord_y;
	
	public Inimigo (int cord_x, int cord_y) {
		this.setCord_x(cord_x);
		this.setCord_y(cord_y);
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



	public void updade(Avatar observavel) {
		// TODO Auto-generated method stub
		
		Avatar avatar = (Avatar) observavel;
		
		if ( (Math.abs(this.cord_x - avatar.getCord_x()) == 0) && (Math.abs(this.cord_y - avatar.getCord_y()) == 0) ){
            // System.out.println("Jogador: "+this+" chuta bola..." );
            avatar.perdaVida(this.atacar());
        }
        //se precisar andar em direcao a bola
        else {
           //se precisa andar para frente 
           if (avatar.getCord_x() > this.cord_x)
        	   this.setCord_x(this.getCord_x() + 1);
           else
        	   this.setCord_x(this.getCord_x() - 1);
           
           //se precisa andar para tras
           if (avatar.getCord_y() > this.cord_y)
        	   this.setCord_y(this.getCord_y() + 1);
           else
        	   this.setCord_y(this.getCord_y() - 1);
     
        }
	}
}
