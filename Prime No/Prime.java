class Prime{
	public static void main(String args[]){
		int i,j,count;
		for(i=2;i<51;i++){
			count = 0;
			for(j=1;j<=i/2;j++)
				if(i%j==0)
					count++;
			if(count==1)
				System.out.print(i+" ");
		}
	}
}