import java.io.*;
import employee.Employee;
class Office{
	public static void main(String args[]){
 
		
		Console con = System.console();
		Employee e1 = new Employee();
		System.out.println("Enter details of Employee 1");
		e1.read();
		System.out.println();

		System.out.println("Enter details of Employee 2");
		System.out.print("Input Name - ");
		String name = con.readLine();
		System.out.print("Input Surname - ");
		String surname = con.readLine();
		System.out.print("Input Phone - ");
		long phone = Long.parseLong(con.readLine());
		System.out.print("Input Salary - ");
		long salary = Long.parseLong(con.readLine());

		Employee e2 = new Employee(name,surname,phone,salary);
		Employee e3 = new Employee(e2);
		
		System.out.println("\n\t\tDetails of Employee");
		System.out.println("Details of Employee 1");
		e1.show();

		System.out.println("Details of Employee 2");
		e2.show();

		System.out.println("Details of Employee 3");
		e3.show();
	}
}