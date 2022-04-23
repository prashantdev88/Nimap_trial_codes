package trial_codes;

public class Casting_basics {

	public static void main(String[] args) {
		
		// ******* casting String --> int 
		String num = "99";
		int sum = Integer.parseInt(num) + 1;
		
		
		// *********** double --->int  
		double num1 = 998.999;
		num1 = num1 + 33.221;
		int sum2 = (int)num1;
		
		Double num2 = 454.4343;
		num2 = num2 + 787.3434;
		int sum3 = num2.intValue();
		System.out.println(sum3);
		
		
	}
}
