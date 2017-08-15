class Power{
	public static void main(String args[]){
		int a,b,res=1,i;
		a = (int)(Math.random()*10);
		b = (int)(Math.random()*10);
		for(i=0;i<b;res*=a,i++);
		System.out.print(a+"^"+b+" = "+res);
	}
}