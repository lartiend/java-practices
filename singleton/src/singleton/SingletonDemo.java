package singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		obj.giveThanks();
	}

}
