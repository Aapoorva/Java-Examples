import static java.lang.Math.*;
class Pyramid{
	public static void main(String args[]){
		int i,j,k,n;
		n = (int)(random()*10);

		System.out.println("Number = "+n);

		for(i=1;i<=n;i++){
//.............................................for space...........
			for(j=n-i;j>0;j--)
				System.out.print(" ");
//.............................................for numbers.........
			for(k=1,j=0;k<i*2;k++){
				j = k<=i?j+1:j-1;
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}