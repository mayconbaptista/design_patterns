import java.util.Scanner;

public class Cliente {
    public static void main (String [] args){
        AbstractFactory factory;
        FactoryPrato prato;
        FactoryGarrafa garrafa;
        FactoryCopo copo;

        System.out.println("qual tipo de objeto deseja criar (2D - 1 | 3D 2) ? ");
        Scanner ler = new Scanner(System.in);

        if(1 == ler.nextInt()){
            factory = new ConstroiObj2D();
        } else {
            factory = new ConstroiObj3D();
        }

        prato = factory.fabricarPrato();
        garrafa = factory.fabricarGrafa();
        copo = factory.fabricarCopo();

        prato.desenharPrato();
        copo.desenharCopo();
        garrafa.desenharGrafa();
    }
}
