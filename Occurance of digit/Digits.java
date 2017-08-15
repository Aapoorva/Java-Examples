class Digits{
	public static void main(String args[]){
		int n,i,rem,d,count=0;
		n = (int)(Math.random()*100000);
		d = (int)(Math.random()*10);
		System.out.println("Number = "+n);
		if(n<10000)
			System.out.print("Invalid Number");
		else{
			System.out.println("Digit = "+d);
			for(i=0;i<5;i++){
				rem = n%10;
				if(rem == d)
					count++;
				n/=10;
			}
			if(count == 0)
				System.out.print(d+" is not present");
			if(count>0)
				System.out.print(d+" appears "+count+" times");
		}
	}
}