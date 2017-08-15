class ThirdMaximum{
	public static void main(String args[]){
		int a,b,c,d,min,smin;
		a = (int)(Math.random()*100);
		b = (int)(Math.random()*100);
		c = (int)(Math.random()*100);
		d = (int)(Math.random()*100);
		System.out.println("a="+a+"\tb="+b+"\tc="+c+"\td="+d);
		if(a<b){
			min=a;
			smin=b;
		}
		else{
			min=b;
			smin=a;
		}
		if(min>c){
			smin=min;
			min=c;
		}
		else
			if(smin>c)
				smin=c;
		if(min>d){
			smin=min;
			min=d;
		}
		else
			if(smin>d)
				smin=d;
	 	System.out.print("Third Maximum = "+smin);		
	}
}