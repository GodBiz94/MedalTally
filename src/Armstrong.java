
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n = 371;
		
		checkArmstrong(n);
	}
	
	static void checkArmstrong(int n) {
		int n1 = n;
		int sum =0;
		while(n > 0) {
			int d = n%10;
			n = n/10;
			sum = sum + (d*d*d);
			
		}
		
		if(n1 == sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not an armstrong");
		
	}

}
