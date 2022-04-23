package trial_codes;

public class Abstraction_java {

	// In this program the Logic to find Sum is hidden only the UseFul method is Average that is shown outside the class Student1 
	public static void main(String[] args) throws Exception{
		Student1 obj = new Student1(12,32,52);
		System.out.println(obj.getAvg());
	}
}

class Student1{
	
	private int english;
	private int math;
	private int science;
	
	public Student1() {
		
	}
	
	public Student1(int english,int math,int science) throws Exception {
		setEnglish(english);
		setMath(math);
		setScience(science);
	}
	
	public void setEnglish(int english) throws Exception {
		if(english < 0) {
			throw new Exception("value should be greater than zero");
		}
		this.english = english;
	}
	
	public void setMath(int math) throws Exception {
		if(math < 0) {
			throw new Exception("value should be greater than zero");
		}
		this.math = math;
	}
	

	public void setScience(int science) throws Exception {
		if(science < 0) {
			throw new Exception("value should be greater than zero");
		}
		this.science = science;
	}
	
	
	private double getSum() {
		return english + math+ science;
	}
	
	public double getAvg() {
		return getSum()/2;
	}
}
