package Fraction;

public class Driver4 {
	public static void main(String [] args)
	{
	Fraction f1 = new Fraction(1,2);
	Fraction.printCount();
	Fraction f2 = new Fraction(2,3);
	Fraction fadd = new Fraction();
	fadd = Fraction.add(f1,f2);
	fadd.print();
	Fraction.printCount();
}
}
