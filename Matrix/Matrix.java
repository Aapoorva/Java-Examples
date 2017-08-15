import java.io.*;
class Matrix{
	private int m[][];
	
	public Matrix(){
		m = new int[3][3];
		System.out.println("Default constructor");
		System.out.println("Matrix size is "+m.length+" x "+m[0].length);	
	}
	public Matrix(int row,int col){
		m = new int[row][col];
		System.out.println("Parameterised constructor");
		System.out.println("Matrix size is "+m.length+" x "+m[0].length);
	}
	public Matrix(Matrix m1){
		m = new int[m1.m.length][m1.m[0].length];
		System.out.println("Copy constructor");
		System.out.println("Matrix size is "+m.length+" x "+m[0].length);
	}
	public void set(){
		Console con = System.console();
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[i].length;j++)
				m[i][j]=0;
		show();
	}
	public void show(){
		System.out.println("Matrix is ");
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++)
				System.out.print(" "+m[i][j]+" ");
			System.out.println();
		}
	}
}