public class AtaqueUpado extends AtaqueDecorado {
    public AtaqueUpado(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public int atacar(){
        return (int)(super.getAtaqueDecorado().atacar() * 1.33);
    }
}
