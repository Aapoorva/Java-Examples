class EvenOdd{
	public static void main(String args[]){
		int a,b,c,d,count=0;
		a = (int)(Math.random()*100);
		b = (int)(Math.random()*100);
		c = (int)(Math.random()*100);
		d = (int)(Math.random()*100);
		System.out.println("a = "+a+"\tb = "+b+"\tc = "+c+"\td = "+d);
		if(a%2==0 && a!=0)
			count++;
		if(b%2==0 && b!=0)
			count++;
		if(c%2==0 && c!=0)
			count++;
		if(d%2==0 && d!=0)
			count++;
		System.out.print("No. of even nos. = "+count);
	}
}