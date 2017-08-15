class Rational{

	private int num,den;

	public Rational(){
	}

	public Rational(int num,int den) throws InvalidDenominatorException{
		invalidDen(num,den);
	}

	public Rational(Rational r){
		num = r.num;
		den = r.den;
	}



	private void invalidDen(int num,int den) throws InvalidDenominatorException{
		if(den!=0){
			this.num = num;
			this.den = den;
		}
		else{
			throw new InvalidDenominatorException("Denominator can't be ZERO");
			
		}
	}

	public void set(int num,int den) throws InvalidDenominatorException{
		invalidDen(num,den);
	}

	public void show(){
		System.out.println(num+"/"+den);
	}

	public Rational add(Rational r){
		Rational temp = new Rational();
		temp.den = den*r.den;
		temp.num = num*r.den + r.num*den;
		return temp;
	}

	public Rational less(Rational r){
		Rational temp = new Rational();
		temp.den = den*r.den;
		temp.num = num*r.den - r.num*den;
		return temp;
	}
	public Rational multiply(Rational r){
		Rational temp = new Rational();
		temp.den = den*r.den;
		temp.num = num*r.num;
		return temp;
	}
	public Rational divide(Rational r){
		Rational temp = new Rational();
		temp.den = den*r.num;
		temp.num = num*r.den;
		return temp;
	}
}