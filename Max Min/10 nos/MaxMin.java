class MaxMin{
	public static void main(String args[]){
		int n,i,max,min;
		for(i=0,max=0,min=100;i<10;i++){
			n = (int)(Math.random()*100);
			System.out.print(n+" ");
			if(max<n)
				max=n;
			if(min>n)
				min=n;
		}
		System.out.print("\nMaximum = "+max+"\nMinimum = "+min);
	}
}