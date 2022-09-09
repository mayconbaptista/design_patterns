public class ConstroiObj3D extends AbstractFactory{

    @Override
    public FactoryCopo fabricarCopo() {
        return new Copo3D() ;
    }

    @Override
    public FactoryGarrafa fabricarGrafa() {
        return new Garrafa3D() ;
    }

    @Override
    public FactoryPrato fabricarPrato() {
        return new Prato3D() ;
    }
}
