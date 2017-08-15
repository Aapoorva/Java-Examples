class Factorial{
	public static void main(String arg[]){
		int n,i,fact;
		n = (int)(Math.random()*10);
		System.out.println("Number = "+n);
		for(i=n,fact=1;i>0;fact*=i,i--);
		System.out.print("Factorial = "+fact);
	}
}