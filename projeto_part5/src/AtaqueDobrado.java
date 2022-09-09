public class AtaqueDobrado extends AtaqueDecorado {

    public AtaqueDobrado (Ataque ataqueDecorado){
        super(ataqueDecorado);
    }

    @Override
    public int atacar(){
        return  (super.getAtaqueDecorado().atacar() * 2);
    }
}
