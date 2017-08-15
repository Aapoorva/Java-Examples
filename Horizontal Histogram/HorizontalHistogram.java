import java.io.*;
class HorizontalHistogram{
	public static void main(String args[]){
		int a[],max=0,i,temp;
		Console con = System.console();
		a = new int[10];		

		System.out.println("Enter 10 values");
		for(i=0;i<a.length;i++)
			a[i] = Integer.parseInt(con.readLine());
		
		System.out.println("HORIZONTAL HISTOGRAM");
		for(int x : a){
			System.out.print(x);
			for(i=0;i<x;i++)
				System.out.print(" *");
			System.out.println();
		}
	}
}