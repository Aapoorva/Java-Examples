import java.io.*;
class Book implements Item{
	private String title,author,publisher;

	public void read(){
		Console con = System.console();
		System.out.print("Enter book Name : ");
		title = con.readLine();
		System.out.print("Enter book Author : ");
		author = con.readLine();
		System.out.print("Enter book Publisher : ");
		publisher = con.readLine();
	}

	public void show(){
		System.out.println("Book : "+title+"\tAuthor : "+author+"\tPublisher : "+publisher);
	}
}