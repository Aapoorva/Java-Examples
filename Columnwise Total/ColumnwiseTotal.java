import java.io.*;
class ColumnwiseTotal{
	public static void main(String args[]){
		int i,j,sum=0,a[][];
		a = new int[3][3];

		Console con = System.console();

		System.out.println("Enter 9 values of matrix");
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
				a[i][j]=Integer.parseInt(con.readLine());

		System.out.println("Columnwise Sum");
		for(i=0;i<a.length;i++){
			sum=0;
			for(j=0;j<a[i].length;j++)
				sum=sum+a[j][i];
			System.out.print(sum +" ");
		}
	}
}