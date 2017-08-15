package employee.contact.person;
import java.io.*;
public class Person{
	private String name;
	private String surname;

	public Person(){
		this("unknown","unknown");
	}
	public Person(String n, String s){
		name = n;
		surname = s;
	}
	public Person(Person p){
		name = p.name;
		surname = p.surname;
	}
	public void read(){
		Console con = System.console();
		System.out.print("Input Name - ");
		name = con.readLine();
		System.out.print("Input Surname - ");
		surname = con.readLine();
	}
	public void show(){
		System.out.println("\tName = "+name+" "+surname);
	}
}