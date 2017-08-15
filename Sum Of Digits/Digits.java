class Digits{
	public static void main(String args[]){
		int n,i,sum=0,rem=0;
		n = (int)(Math.random()*100000);
		System.out.println("Number = "+n);
		for(i=0;i<5;i++){
			rem = n%10;
			sum+=rem;
			n/=10;
		}
		System.out.print("Sum = "+sum);
	}
}