import java.io.*;
class SortingArray{
	public static void main(String args[]){
		int a[],i,j,temp;
		Console con = System.console();
		a = new int[10];

		System.out.println("Enter 10 values");
		for(i=0;i<a.length;i++)
			a[i] = Integer.parseInt(con.readLine());

		for(i=0;i<a.length-1;i++){
			for(j=1;j<a.length-i;j++)
				if(a[j-1]>a[j]){
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
		}

		System.out.println("Sorted Array");
		for(int x : a)
			System.out.print(x+" ");
	}
}