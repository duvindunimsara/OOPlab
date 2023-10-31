package VG;

import java.util.Scanner;

public class Maneger extends Employee {
	
	 protected int ProductNo1;
	protected int ProductNo2;
	protected int ProductNo3;
	protected String Department;
	
	public Maneger(String Empid, String name, String address, int productNo1, int productNo2, int productNo3,
			String department) {
		super(Empid, name, address);
		this.ProductNo1 = productNo1;
		this.ProductNo2 = productNo2;
		this.ProductNo3 = productNo3;
		this.Department = department;
	}
	
	public void Read() {
		super.Read();
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Department :");
			this.Department = sc.next();
			
			System.out.println("Enter Product no 1 :");
			this.ProductNo1 = sc.nextInt();
			
			System.out.println("Enter Product no 2 :");
			this.ProductNo2 = sc.nextInt();
			
			System.out.println("Enter product no 3 :");
			this.ProductNo3 = sc.nextInt();
			
		}
		catch(Exception ex1) {
			System.out.println(ex1);
			
		}
	}
	
	public void Print()
	{
		super.print();
		
		System.out.println("Department : "+this.Department);
		System.out.println("ProductNo1 : "+this.ProductNo1);
		System.out.println("ProductNo2 : "+this.ProductNo2);
		System.out.println("ProductNo3 : "+this.ProductNo3);
	}

}
