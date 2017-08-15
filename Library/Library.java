import java.io.*;
class Library{
	public static void main(String args[]){
		
		Console con = System.console();
		String option;
		Item item[] = new Item[3];
		int i;

		for(i=0;i<item.length;i++){
			System.out.print("Select book or dvd <b/d> : ");
			option = con.readLine();
			option = option.trim();
			item[i] = option.equals("b")?new Book() : new Dvd();
			item[i].read();
		}

		System.out.println("\n\t\tList of issued items\n");
		for(i=0;i<item.length;i++)
			item[i].show();
	}
}