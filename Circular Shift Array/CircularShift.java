import java.io.*;
class CircularShift{
	public static void main(String args[]){
		int a[],i,j,n,temp;
		a = new int[10];
		Console con = System.console();

		System.out.println("Enter values");
		for(i=0;i<a.length;i++)
			a[i] = Integer.parseInt(con.readLine());

		System.out.print("Enter no. of places shift = ");
		n = Integer.parseInt(con.readLine());

		for(i=0;i<n;i++){
			for(j=1;j<a.length;j++){
				temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
			}	
		}
		for(int x : a)
			System.out.print(x+" ");
	}
}