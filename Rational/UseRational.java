import java.io.*;
class UseRational{
	public static void main(String args[]){

		Console con = System.console();
		Rational n1 = new Rational();
		Rational n2 = null;
		try{
			int a,b;

			System.out.println("Input numerator & denominator of 1");
			a = Integer.parseInt(con.readLine());
			b = Integer.parseInt(con.readLine());
			n1 = new Rational(a,b);

			System.out.println("Input numerator & denominator of 2");
			a = Integer.parseInt(con.readLine());
			b = Integer.parseInt(con.readLine());
			n2 = new Rational(a,b);
		}
		catch(InvalidDenominatorException e){
			System.out.println(e.getMessage());
		}

		System.out.print("First rational no. = ");	
		n1.show();

		System.out.print("Second rational no. = ");
		n2.show();

		Rational m1,m2,m3,m4;
		m1 = n1.add(n2);
		System.out.print("Addition = ");
		m1.show();

		m2 = n1.less(n2);
		System.out.print("Difference = ");
		m2.show();

		m3 = n1.multiply(n2);
		System.out.print("Multiplication = ");
		m3.show();

		m4 = n1.divide(n2);
		System.out.print("Division = ");
		m4.show();
	}
}