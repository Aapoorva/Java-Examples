class SecondMaximum{
	public static void main(String args[]){
		int a,b,c,max,smax;
		a = (int)(Math.random()*100);
		b = (int)(Math.random()*100);
		c = (int)(Math.random()*100);
		System.out.println("a="+a+"\tb="+b+"\tc="+c);
		if(a>b){
			max=a;
			smax=b;
		}
		else{
			max=b;
			smax=a;
		}
		if(c>max){
			smax=max;
			max=c;
		}
		else
			if(c>smax)
				smax=c;
		System.out.print("SECOND MAXIMUM = "+smax);
	}
}