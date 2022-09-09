import java.util.*;

package factory;

public abstract class FabricaNota {
	
	private int valor;
	
	public abstract FabricaNota CriaNota(int valor);
}
