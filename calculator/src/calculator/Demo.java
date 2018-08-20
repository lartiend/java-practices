package calculator;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
//		CalcFactory calcFactory = new CalcFactory();
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int a = input1.nextInt(); 
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter second num: ");
		int b = input2.nextInt();
		
		Scanner choice = new Scanner(System.in);
		System.out.println("What operation? 'Add' or 'Subtract'");
		String operation= choice.nextLine();
		
		Process demo = CalcFactory.buildClass(operation);
		System.out.println(demo.Operate(a, b));
		
		input1.close();
		input2.close();
		choice.close();
	}
}
