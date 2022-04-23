package trial_codes;

public class Encapsulation_Basic {

	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.setMarks1(12);
		s1.setMarks2(13);
		System.out.println(s1.getSum());
		
		// We cannot actually access the variables of the class Student we access it by Getter and Setter only
	} 
	
}

class Student{
	
	private double marks1;
	private double marks2;
	
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	
	public double getSum() {
		return marks1 + marks2;
	}
}
