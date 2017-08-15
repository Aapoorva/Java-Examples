class MaxMin{
	public static void main(String args[]){
		int a,b,c,d,max,min;
		a = (int)(Math.random()*100);
		b = (int)(Math.random()*100);
		c = (int)(Math.random()*100);
		d = (int)(Math.random()*100);
		System.out.println("a="+a+"\tb="+b+"\tc="+c+"\td="+d);
		if(a<b){
			max=b;
			min=a;
		}
		else{
			min=b;
			max=a;
		}
		if(max<c)
			max=c;
		if(max<d)
			max=d;
//.................MINIMUM............... 		
		if(min>c)
			min=c;
		if(min>d)
			min=d;

		System.out.print("Maximum = "+max+"\nMinimum = "+min);
	}
}