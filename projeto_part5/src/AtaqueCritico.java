public class AtaqueCritico extends AtaqueDecorado {

    public AtaqueCritico(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public int atacar (){
        return (int)(super.getAtaqueDecorado().atacar() + ( super.getAtaqueDecorado().atacar() * Math.random()));
    }
}
