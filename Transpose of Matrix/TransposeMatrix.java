import java.io.*;
class TransposeMatrix{
	public static void main(String args[]){
		int a[][],i,j,temp;
		a = new int[3][3];
		Console con = System.console();

		System.out.println("Enter 9 values of matrix");
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
				a[i][j] = Integer.parseInt(con.readLine());

		for(i=0;i<a.length;i++)
			for(j=i+1;j<a[i].length;j++){
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}

		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
			}
	}
}