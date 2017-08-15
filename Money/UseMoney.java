import finance.Money;
class UseMoney{
	public static void main(String args[]){
		Money m1 = new Money();
		m1.show();

		Money m2 = new Money(1000,5);
		m2.show();

		Money m3 = new Money(m2);
		m3.show();

		m2 = null;
		System.out.println("M2 = "+m2);
	
	}
}