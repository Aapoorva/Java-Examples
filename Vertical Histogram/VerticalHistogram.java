import java.io.*;
class VerticalHistogram{
	public static void main(String args[]){
		int a[],max=0,i,temp;
		Console con = System.console();
		a = new int[10];		

		System.out.println("Enter 10 values");
		for(i=0;i<a.length;i++)
			a[i] = Integer.parseInt(con.readLine());

		for(int x : a)
			if(max < x)
				max = x;

		temp = max;
		for(i=0;i<max;i++){
			for(int x : a){
				if(x>=temp)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			temp--;
			System.out.println();
		}
		for(int x : a)
			System.out.print(" "+x+" ");
	}
}