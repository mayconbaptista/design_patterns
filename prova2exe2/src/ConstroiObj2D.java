public class ConstroiObj2D extends AbstractFactory{

    @Override
    public FactoryCopo fabricarCopo() {
        return new Copo2D();
    }

    @Override
    public FactoryGarrafa fabricarGrafa() {
        return new Garrafa2D();
    }

    @Override
    public FactoryPrato fabricarPrato() {
        return  new Prato2D();
    }
}
