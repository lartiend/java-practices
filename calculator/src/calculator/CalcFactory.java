package calculator;

public class CalcFactory {

	public static Process buildClass(String name) {
		if(!ClassCheck.isClass(name)) {
			System.out.println("Class Not Found!");
		}
		if(name.equals("Add")) return new Add();
		if(name.equals("Subtract")) return new Subtract();
		return null;
	}

}
