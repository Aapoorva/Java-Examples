class Pattern{
	public static void main(String args[]){
		int i,j,n,t;
		n = (int)(Math.random()*10);
		System.out.println("Number = "+n);
		for(i=1,t=0;i<=n;i++){
			for(j=i;j>0;j--,t++)
				System.out.print(t%10);
			System.out.print("\n");
		}
	}
}