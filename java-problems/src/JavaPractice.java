
public class JavaPractice {

/*	static void findTermAndSum(int term) {
		int n1=0,n2=1,n3=0,i=0,sum=0;
		while (n3 <= term) {
			 n3 = i==0 ? 0 : n1+n2;
			 n1=n2;
			 n2=n3;
			 i++;
			 sum+=n3;
		}
		System.out.println(n3);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		JavaPractice.findTermAndSum(1000);
	}*/
	
	static void findPopulation(int days) {
		int constOffspring = 8;
		int sum =0;
		int offspringNew = constOffspring*days;
		if(days%8== 0 || days%15== 0 || days%22== 0) {
			sum = 1 + (constOffspring*days) + offspringNew;				
		} else {
			sum = 1 + (constOffspring*days);
		}
		System.out.println(sum); 
	}
	
	public static void main(String[] args) {
		JavaPractice.findPopulation(28);
	}

}
