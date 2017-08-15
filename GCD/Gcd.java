class Gcd{
	public static void main(String args[]){
		int a,b,rem=1,temp;
		a = (int)(Math.random()*100);
		b = (int)(Math.random()*100);
		System.out.print("GCD("+a+","+b+") = ");
		if(b>a){
			temp = a;
			a = b;
			b = temp;
		}
		if(a%b==0)
			rem = b;
		
		while(a%b>0){
			rem = a%b;
			a = b;
			b = rem;	
		}
		System.out.print(rem);
	}
}