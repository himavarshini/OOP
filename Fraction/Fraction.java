package Fraction;

public class Fraction {
	protected int numerator;
	protected int denominator;
	public static int count =0;
	Fraction()
	{
		this.numerator = 2;
		this.denominator = 3;
		incrementCount();
	}
	Fraction(int n)
	{
			this.numerator = n;
			this.denominator = 1;
			incrementCount();
	}
	Fraction(int n,int d)
	{
			this.numerator = n;
			this.denominator = d;
			incrementCount();
	}
	public void setNumerator(int n)
	{
		this.numerator = n;
	}
	public void setDenominator(int n)
	{
		this.denominator = n;
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public void print()
	{
		System.out.println("The fraction is " + this.numerator + "/" + this.denominator);
	}
	public Fraction inverse()
	{
		Fraction inv = new Fraction();
		inv.numerator = this.denominator;
		inv.denominator = this.numerator;
		return inv;
	}
	public void reduce()
	{
		int x;
		x = gcd();
		numerator = numerator/x;
		denominator = denominator/x;
	}
	public int gcd()
	{
		int g=1;
		for(int i=1 ; i<=numerator && i<=denominator ; i++)
		{
			if(numerator%i == 0 && denominator%i == 0)
				g=i;
		}
		return g;
	}
	public Fraction computeInverse()
	{
		Fraction inv = new Fraction(denominator,numerator);
		return  inv;
	}
	public boolean isProper()
	{
		if(this.numerator < this.denominator)
			return true;
		else
			return false;
	}
	public Fraction add(Fraction frac) 
	{
		// This method can currently handle only fractions with same base
		int numerSum;
		if ( this.denominator == frac.getDenominator()) 
		{
		numerSum = this.numerator + frac.getNumerator();
		Fraction sum = new Fraction(numerSum, this.denominator);
		return sum;
		}
		else
			return null;
	}
	public Fraction subtract(Fraction frac) 
	{
		// This method can currently handle only fractions with same base
		int numerDif;
		if ( this.denominator == frac.getDenominator()) 
		{
		numerDif = this.numerator - frac.getNumerator();
		Fraction sub = new Fraction(numerDif, this.denominator);
		return sub;
		}
		else
			return null;
	}
	public static Fraction multiply(Fraction frac1,Fraction frac2) 
	{
		Fraction product = new Fraction();
		product.numerator = frac1.getNumerator() * frac2.getNumerator(); 
		product.denominator = frac1.getDenominator() * frac2.getDenominator();
		return product;
	}
	public static Fraction divide(Fraction frac1,Fraction frac2)
	{
		Fraction division = new Fraction();
		division = multiply(frac1,frac2.inverse());
		return division;
	}
	
	public static Fraction add(Fraction first,Fraction second)
	{
		Fraction fsum = new Fraction();
		if(first.getDenominator() == second.getDenominator())
		{
			fsum.numerator = first.getNumerator() + second.getDenominator() ;
			fsum.denominator = first.getNumerator();
		}
		else
		{
			fsum.numerator = (first.getNumerator() * second.getDenominator()) + (second.getNumerator() * first.getDenominator()) ;
			fsum.denominator = first.getDenominator() * second.getDenominator() ;
		}
		return fsum;
	}
	
	public static Fraction subtract(Fraction first,Fraction second)
	{
		Fraction fsub = new Fraction();
		if(first.getDenominator() == second.getDenominator())
		{
			fsub.numerator = first.getNumerator() - second.getDenominator() ;
			fsub.denominator = first.getDenominator();
		} 
		else
		{
			fsub.numerator = (first.getNumerator() * second.getDenominator()) - (second.getNumerator() * first.getDenominator()) ;
			fsub.denominator = first.getDenominator() * second.getDenominator() ;
		}
		return fsub;
	}

 	private static void incrementCount()
	{
		count++;
	}
	
	 public static void printCount() 
	 {
		 System.out.println("count = " + count);
	 } 
	 
	 public boolean ZeroFraction()
	 {
		 if(this.numerator==0 && this.denominator==0)
			return true;
		 else 
			return false; 
	 }
	 
	 public boolean FractionOne()	
	 {
		 if(this.numerator==1 && this.denominator==1)
				return true;
			 else 
				return false; 
	 }
	 public String toString()
	 {
		 return (numerator + "/" + denominator); 
	 }
}