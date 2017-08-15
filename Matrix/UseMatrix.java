import java.io.*;
class UseMatrix{
	public static void main(String args[]){
		Console con = System.console();
		
		Matrix m1 = new Matrix();
		//System.out.print("Enter elements of matrix m1");
		m1.show();
		
		System.out.println("Input no. of matrix row & column");
		int row = Integer.parseInt(con.readLine());	
		int col = Integer.parseInt(con.readLine());
		Matrix m2 = new Matrix(row,col);
		//System.out.print("Enter elements of matrix m2");
		m2.show();
		
		Matrix m3 = new Matrix(m2);
		//System.out.print("Enter elements of matrix m3");
		m3.show();
	}
}