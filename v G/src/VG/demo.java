package VG;

public class demo {

	public static void main(String[] args) 
	{
		Employee emp = new Employee(null, null, null);
	
		Maneger mg = new Maneger(null, null, null, 0, 0, 0, null);
		
		emp.Read();
		emp.print();
		
		mg.Read();
		mg.Read();
		
		

	}
 
}