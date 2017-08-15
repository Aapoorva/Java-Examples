import java.io.*;

class LeftShift{
	public static void main(String args[]){
		int a[],i,j,n,temp;
		a = new int[10];
		Console con = System.console();

		System.out.println("Enter 10 values");
		for(i=0;i<a.length;i++)
			a[i]=Integer.parseInt(con.readLine());

		System.out.println("Enter no. of positions shift");
		n = Integer.parseInt(con.readLine());

		for(i=0;i<n;i++){
			for(j=1;j<a.length-i;j++){
				temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
			}
			a[a.length-i-1]=0;
		}

		System.out.println("Shifted Array");
		for(int x : a)
			System.out.print(x+" ");
	}
}