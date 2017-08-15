import java.io.*;
class Dvd implements Item{
	private String title,director,category;
	
	public void read(){
		Console con =  System.console();
		System.out.print("Enter Dvd Title : ");
		title = con.readLine();
		System.out.print("Enter Dvd Director : ");
		director = con.readLine();
		System.out.print("Enter Dvd Category : ");
		category = con.readLine();
	}

	public void show(){
		System.out.println("Dvd : "+title+"\tDirector : "+director+"\tCategory : "+category);
	}
}