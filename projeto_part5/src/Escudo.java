public class Escudo {
    private Escudo sucessor;

    public void setSucessor(Escudo sucessor) {
        this.sucessor = sucessor;
    }

    public Escudo getSucessor() {
        return sucessor;
    }

    public int processaEscudo (int dano){

        dano = (int) (dano - (dano * 0.10));

        if(this.getSucessor() == null || dano == 0){
            return dano;
        }
        else
            return this.getSucessor().processaEscudo((int) (dano - (dano * 0.10)));
    }
}
