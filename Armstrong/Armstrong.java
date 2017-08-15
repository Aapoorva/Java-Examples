class Armstrong{
	public static void main(String agrs[]){
		int i,n,rem,sum;
		for(i=0;i<1000;i++){
			n=i;
			sum=0;
			while(n>0){
				rem = n%10;
				sum = sum +rem*rem*rem;
				n/=10;
			}
			if(sum == i)
				System.out.print(i+" ");
		}
	}
}