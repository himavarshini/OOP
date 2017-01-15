package Fraction;
public class Driver3 {

	public static void main(String[] args) 
	{
		
		Fraction f3 = new Fraction(2,5);
		System.out.print("inverse of ");
		f3 =  f3.inverse();
		f3.print();
		Fraction f4 = new Fraction(4,12);
		f4.reduce();
		System.out.print("Reduced form of ");
		f4.print();
		if(f3.isProper() == true)
		{
			System.out.println("The given Fraction is Proper fraction");
		}
		else
		{
			System.out.println("The given fraction is improper fraction");
		}
		Fraction f5 = new Fraction(3,5);
		Fraction f6 = f5.computeInverse();
		f5.print();
		System.out.print("inverse of ");
		f6.print();
		Fraction f7 = new Fraction(4,5);
		Fraction fsum = new Fraction();
		fsum = f5.add(f7);
		if(fsum != null)
		{
			System.out.print("After addition ");
			fsum.print();
		}
		else
			System.out.println("The fractions addition is not possible");
		Fraction fsubtract = new Fraction();
		fsubtract = f5.subtract(f7);
		if(fsubtract != null)
		{
			System.out.print("After subtraction ");
			fsubtract.print();
		}
		else
			System.out.println("The fractions subtraction is not possible");
		Fraction fmultiply = new Fraction();
		fmultiply = Fraction.multiply(f5,f7);
		System.out.print("Multiplication of ");
		fmultiply.print();
		Fraction fdivision = new Fraction();
		fdivision = Fraction.divide(f5,f7);
		System.out.print("Division of ");
		fdivision.print();
		Fraction.multiply(f3,f3.computeInverse()).print() ;
	}


	
	
	
	

}
