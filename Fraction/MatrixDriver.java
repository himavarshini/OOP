package Fraction;

public class MatrixDriver
{
	public static void main(String [] args)
	{
		MatrixFraction mf1 = new MatrixFraction();
		MatrixFraction mf2 = new MatrixFraction();
		Fraction f00  = new Fraction(1,2) , f01 = new Fraction(1,2) , f02 = new Fraction(1,2) , f10 = new Fraction(1,2), f11 = new Fraction(1,2), f12 = new Fraction(1,2), f20  = new Fraction(1,2), f21  = new Fraction(1,2), f22 = new Fraction(1,2);
		mf2.setMatrix(f00,f01,f02,f10,f11,f12,f20,f21,f22);
		
	}
}
