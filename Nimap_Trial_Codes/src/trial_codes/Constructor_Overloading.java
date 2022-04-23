package trial_codes;

public class Constructor_Overloading {

	public static void main(String[] args) {
		
	}
}


class Student2{
	

	private int id;
	private String name;
	private String classroom;
	private String division;
	
	Student2(int id,String name)throws Exception {
		setId(id);
		setName(name);
	}
	
	Student2(int id, String name,String classroom,String division)throws Exception{
		setId(id);
		setName(name);
		setClassroom(classroom);
		setDivision(division);
	}

	
	Student2(int id, String name,String classroom)throws Exception{
		setId(id);
		setName(name);
		setClassroom(classroom);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id)throws Exception {
		if(id < 100) {
			throw new Exception("Id value start from 101");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	
}