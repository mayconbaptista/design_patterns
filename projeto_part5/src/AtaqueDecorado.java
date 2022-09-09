public abstract class AtaqueDecorado implements Ataque {

    private Ataque ataqueDecorado;

    public  AtaqueDecorado(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    public Ataque getAtaqueDecorado() {
        return ataqueDecorado;
    }

    @Override
    public int atacar (){
        return this.ataqueDecorado.atacar();
    }
}
