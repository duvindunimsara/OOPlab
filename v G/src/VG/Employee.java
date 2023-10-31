package VG;

import java.util.Scanner;

public class Employee {
	protected  String Empid;
	protected String name;
	protected String address;
	
	public Employee(String empid2, String name2, String address2) {
		this.Empid = Empid;
		this.name = name;
		this.address = address;
	}
	
	public void Read() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Eid :");
		this.Empid = sc.next();
		
		System.out.println("Enter name :");
		this.name = sc.next();
		
		System.out.println("Enter address :");
		this.address = sc.next();
	}
	public void print() {
		System.out.println("Employee ID :" +this.Empid);
		System.out.println("Employee name :" +this.name);
		System.out.println("Employee address :" +this.address);
	}
	

}
