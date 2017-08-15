package employee;
import java.io.*;
import employee.contact.*;
public class Employee extends ContactInfo{
	private long salary;

	public Employee(){
	}
	public Employee(String n,String surn,long p,long s){
		super(n,surn,p);
		salary = s;
	}
	public Employee(Employee e){	
		super(e);
		salary = e.salary;
	}
	public void read(){
		super.read();
		Console con = System.console();
		System.out.print("Input Salary - ");
		salary = Long.parseLong(con.readLine());
	}
	public void show(){
		super.show();
		System.out.println("\tSalary = "+salary);
		System.out.println();	
	}
}