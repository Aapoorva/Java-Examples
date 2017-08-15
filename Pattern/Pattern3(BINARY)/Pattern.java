class Pattern{
	public static void main(String args[]){
		int i,j,n,t;
		n = (int)(Math.random()*10);
		System.out.println("Number = "+n);
		for(i=0,t=0;i<n;i++){
			for(j=i+1;j>0;j--){
				System.out.print(t);
				t=t==0?1:0;
			}
			System.out.print("\n");
		}
	}
}