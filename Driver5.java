package Fraction;

public class Driver5 
{
	public static void main(String [] args)
	{
		Fraction [] fracArray = new Fraction[5]; 
		fracArray[0] = new Fraction(2,5);
		fracArray[2] = new Fraction();
		fracArray[3] = new Fraction(4); 
		fracArray[0].inverse().print(); 
		Fraction.multiply(fracArray[3],fracArray[2]).print() ;
		System.out.println("The size of array is " + fracArray.length);
		

	}
	
}
