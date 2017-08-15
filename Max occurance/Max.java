class Max{
	public static void main(String args[]){
		int n,i,max,count;
		for(i=0,max=0,count=0;i<10;i++){
			n = (int)(Math.random()*10);
			System.out.print(n+" ");
			if(max<n){
				max=n;
				count=0;
			}
			if(max==n)
				count++;
		}
		System.out.print("\nMax = "+max+" It occurs "+count+" times");
	}
}