package trial_codes;

import java.util.Scanner;

public class Try_catch_Block {

	public static void main(String[] args) throws CustomException {
		
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt() == 2) {
			throw new CustomException("Has input as 2");
		}
		
		try {
				int data = 100/0;	
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside the Finally BLOCK");
		}
	}
}


class CustomException extends Exception{
	
	public CustomException(String msg) {
		super(msg);
	}
}