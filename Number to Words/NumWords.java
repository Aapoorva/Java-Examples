class NumWords{
	public static void main(String args[]){
		int num,a,b,c,d;
		num = (int)(Math.random()*10000);
		System.out.println("Number = "+num);
		a = num/1000;
		b = num/100%10;
		c = num%100/10;
		d = num%10;
		if(num<1000)
			System.out.print("Invalid No.");
		else{
			switch(a){
				case 1:
					System.out.print("One");
					break;
				case 2:
					System.out.print("Two");
					break;
				case 3:
					System.out.print("Three");
					break;
				case 4:
					System.out.print("Four");
					break;
				case 5:
					System.out.print("Five");
					break;
				case 6:
					System.out.print("Six");	
					break;
				case 7:
					System.out.print("Seven");
					break;
				case 8:
					System.out.print("Eight");
					break;
				case 9:
					System.out.print("Nine");
			}
			System.out.print(" Thousand ");

			switch(b){
				case 1:
					System.out.print("One");
					break;
				case 2:
					System.out.print("Two");
					break;
				case 3:
					System.out.print("Three");
					break;
				case 4:
					System.out.print("Four");
					break;
				case 5:
					System.out.print("Five");
					break;
				case 6:
					System.out.print("Six");
					break;
				case 7:
					System.out.print("Seven");
					break;
				case 8:
					System.out.print("Eight");
					break;
				case 9:
					System.out.print("Nine");
			}
			if(b!=0)
				System.out.print(" Hundred ");
			if(c!=1){
				switch(c){
					case 2:
						System.out.print("Twenty");
						break;
					case 3:
						System.out.print("Thirty");
						break;
					case 4:
						System.out.print("Forty");
						break;
					case 5:
						System.out.print("Fifty");
						break;
					case 6:
						System.out.print("Sixty");
						break;
					case 7:
						System.out.print("Seventy");
						break;
					case 8:
						System.out.print("Eighty");
						break;
					case 9:
						System.out.print("Ninty");
				}
				switch(d){
					case 1:
						System.out.print(" One");
						break;
					case 2:
						System.out.print(" Two");
						break;
					case 3:
						System.out.print(" Three");
						break;
					case 4:
						System.out.print(" Four");
						break;
					case 5:
						System.out.print(" Five");
						break;
					case 6:
						System.out.print(" Six");
						break;
					case 7:
						System.out.print(" Seven");
						break;
					case 8:
						System.out.print(" Eight");
						break;
					case 9:
						System.out.print(" Nine");
				}
			}
			if(c==1){
				switch(d){
					case 0:
						System.out.print("Ten");
						break;
					case 1:
						System.out.print("Eleven");
						break;
					case 2:
						System.out.print("Twelve");
						break;
					case 3:
						System.out.print("Thirteen");
						break;
					case 4:
						System.out.print("Fourteen");
						break;
					case 5:
						System.out.print("Fifteen");
						break;
					case 6:
						System.out.print("Sixteen");
						break;
					case 7:
						System.out.print("Seventeen");
						break;
					case 8:
						System.out.print("Eighteen");
						break;
					case 9:
						System.out.print("Nineteen");
				}
			}
		}
	}
}