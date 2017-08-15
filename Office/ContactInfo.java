package employee.contact;
import java.io.*;
import employee.contact.person.*;
public class ContactInfo extends Person{
	private long phone;

	public ContactInfo(){
	}
	public ContactInfo(String n,String s,long p){
		super(n,s);
		phone = p;
	}
	public ContactInfo(ContactInfo c){
		super(c);
		phone = c.phone;
	}
	public void read(){
		Console con = System.console();
		super.read();
		System.out.print("Input Phone - ");
		phone = Long.parseLong(con.readLine());
	}
	public void show(){
		super.show();
		System.out.println("\tPhone = "+phone);
	}
}