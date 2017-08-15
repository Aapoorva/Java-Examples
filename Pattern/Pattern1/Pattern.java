class Pattern{
	public static void main(String args[]){
		int i,j,n;
		n = (int)(Math.random()*10);
		System.out.println("Number = "+n);
		for(i=1;i<=n;i++){
			for(j=i;j>0;j--)
				System.out.print(i);
			System.out.print("\n");
		}
	}
}