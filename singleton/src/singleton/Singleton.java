package singleton;

public class Singleton {

	private Singleton() {}
	private static Singleton singleObject = new Singleton();
	public static Singleton getInstance() {
		return singleObject;
	}
	public void giveThanks() {
		System.out.println("Thanks! Inside Singleton");
	} 

}
