class SuperPallindrome{
	public static void main(String args[]){
		int i,n,sq,n_sq,rev,rev_sq,rem;
		for(i=1;i<1001;i++){
			rev=0;
			rev_sq=0;
			n = i;
			sq = n*n;
			while(n>0){
				rem = n%10;
				rev = rev*10 + rem;
				n=n/10; 
			}
			n_sq = sq;
			while(sq>0){
				rem = sq%10;
				rev_sq = rev_sq*10 + rem;
				sq=sq/10; 
			}
			if(i == rev && n_sq == rev_sq)
				System.out.print(i+" ");
		}
	}
}