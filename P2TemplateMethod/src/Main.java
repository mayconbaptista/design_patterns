
public class Main {

	public static void main(String[] args) {
		System.out.println("*******Template Method******");
		System.out.println("****************************");
		
		Concrete1 c1 = new Concrete1 ();
		Concrete2 c2 = new Concrete2 ();
		
		c1.templateMethod();
		c2.templateMethod();
	}

}
