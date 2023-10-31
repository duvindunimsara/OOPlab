package VE;

public class student {
	private String StudentID;
	private String StudentName;
	public student(String studentID, String studentName) {
		super();
		StudentID = studentID;
		StudentName = studentName;
	}
	
	public void display() {
		try{if
			(!StudentID.startsWith("IT") || StudentID.substring(2).matches("\\d{8}")){
			
			throw new InvalidITNumberException();
		}
		System.out.println("Student ID : "+StudentID);
		System.out.println("Student Name :"+StudentName);
	}catch(InvalidITNumberException e) {
		System.out.println("Error" + e.getMessage());
	}
		
	}
	
}
