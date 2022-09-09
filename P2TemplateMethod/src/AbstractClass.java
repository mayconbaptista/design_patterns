
public abstract class AbstractClass {

	public final void templateMethod () {
		System.out.println("AbstractClass.templateMethod();");
		primitiveOperatiion1();
		primitiveOperatiion2();
	}
	
	public abstract void primitiveOperatiion1();
	public abstract void primitiveOperatiion2();
}
