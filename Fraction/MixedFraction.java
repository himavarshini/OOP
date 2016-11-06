package Fraction;

public class MixedFraction extends Fraction{
	private int wholeNum;
	
	public void setWholeNum(int w)
	{
		this.wholeNum = w;
	}

	public int getWholeNum()
	{
		return this.wholeNum;
	}
	
	public void print()
	{
		System.out.println("The mixed fraction is: " + this.wholeNum + "("+this.numerator + "/" + this.denominator +")");
	}
}
