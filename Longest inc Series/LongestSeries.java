class LongestSeries{
	public static void main(String args[]){
		int n,count_max = 0,count,i,n_pre;
		for(i=0,count=1,n_pre=100; i<10 ; i++){
			n = (int)(Math.random()*100);
			System.out.print(n+" ");
			if(n_pre<n)
				count++;
			if(n_pre>n){
				if(count_max<count)
					count_max = count;
				count = 1;
			}
			n_pre = n;
		}
		if(count_max<count)
			count_max = count;
		System.out.print("\nLenght of Longest Series = "+count_max);
	}
}