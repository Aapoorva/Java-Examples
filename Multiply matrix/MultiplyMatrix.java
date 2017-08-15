import java.io.*;
class MultiplyMatrix{
	public static void main(String args[]){
		int i,j,k,a[][],b[][],c[][];
		a = new int[3][3];
		b = new int[3][3];
		c = new int[3][3];

		Console con = System.console();
		
		System.out.println("Enter 9 values of matrix 1");
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
				a[i][j]=Integer.parseInt(con.readLine());

		System.out.println("Enter 9 values of matrix 2");
		for(i=0;i<b.length;i++)
			for(j=0;j<b[i].length;j++)
				b[i][j]=Integer.parseInt(con.readLine());

		System.out.println("Multiplication Matrix");
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				c[i][j]=0;
				for(k=0;k<a.length;k++)
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}