class Maximum{
	public static void main(String args[]){
		int a,b,c,max;
		a = (int)(Math.random()*100);
		b = (int)(Math.random()*100);
		c = (int)(Math.random()*100);
		System.out.println("a="+a+"\tb="+b+"\tc="+c);
		if(a>b)
			max=a;
		else
			max=b;
		if(c>max)
			max=c;
		System.out.print("MAXIMUM = "+max);
	}
}