package calculator;

public class ClassCheck {

	public static boolean isClass(String className) {
	    try  {
	    	String classVar = "calculator."+className;
	        Class.forName(classVar);
	        return true;
	    }  catch (ClassNotFoundException e) {
	        return false;
	    }
	}

}
