package trial_codes;

import java.awt.Point;
import java.util.Arrays;


public class Premetive_refrence_Type {
	
	public static void main(String[] args) {
		
//		********Refrence Type******************
		Point p1 = new Point(1,2);
		Point p2= p1;
		System.out.println(p2);
		p1.x = 9;
		System.out.println(p2);
		int [] arr = {1,2,3,4,5};
		int [] arr1 = arr;
		arr1[0] = 100;
		System.out.println(Arrays.toString(arr));
		
//		********Primitive Type******************
		int a = 34;
		int b = 442;
		System.out.println(b);
		a = 90;
		System.out.println(b);
	}
}
 
class Ref{

	
}