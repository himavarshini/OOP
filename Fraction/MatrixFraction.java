package Fraction;
public class MatrixFraction 
{
	private Fraction [][] matrixFrac;
	 
			// Constructor section
	
	MatrixFraction() 
	{
			// default constructor - initializes to identity matrix
		matrixFrac = new Fraction[3][3];		 	// First create array of 3x3 size
		matrixFrac[0][0] = new Fraction(1,1); 		// Then populate the matrix
		matrixFrac[0][1] = new Fraction(0,1);
		matrixFrac[0][2] = new Fraction(0,1);
		matrixFrac[1][0] = new Fraction(0,1);
		matrixFrac[1][1] = new Fraction(1,1);
		matrixFrac[1][2] = new Fraction(0,1);
		matrixFrac[2][0] = new Fraction(0,1);
		matrixFrac[2][1] = new Fraction(0,1);
		matrixFrac[2][2] = new Fraction(1,1);
	}/** To compute the inverse of a matrix */
	
	public void setMatrix() 
	{
			// default constructor - initializes to identity matrix
		matrixFrac = new Fraction[3][3];		 	// First create array of 3x3 size
		matrixFrac[0][0] = new Fraction(1,1); 		// Then populate the matrix
		matrixFrac[0][1] = new Fraction(0,1);
		matrixFrac[0][2] = new Fraction(0,1);
		matrixFrac[1][0] = new Fraction(0,1);
		matrixFrac[1][1] = new Fraction(1,1);
		matrixFrac[1][2] = new Fraction(0,1);
		matrixFrac[2][0] = new Fraction(0,1);
		matrixFrac[2][1] = new Fraction(0,1);
		matrixFrac[2][2] = new Fraction(1,1);
	}
	
	MatrixFraction(Fraction f00, Fraction f01, Fraction f02,Fraction f10, Fraction f11, Fraction f12,Fraction f20, Fraction f21, Fraction f22) 
	{
		matrixFrac = new Fraction[3][3];
		matrixFrac[0][0] = f00;
		matrixFrac[0][1] = f01;
		matrixFrac[0][2] = f02;
		matrixFrac[1][0] = f10;
		matrixFrac[1][1] = f11;
		matrixFrac[1][2] = f12;
		matrixFrac[2][0] = f20;
		matrixFrac[2][1] = f21;
		matrixFrac[2][2] = f22;
	}
	
	/** To set the values of all the elements of the matrix */
	
	public void setMatrix(Fraction f00, Fraction f01,Fraction f02,Fraction f10, Fraction f11,Fraction f12,Fraction f20, Fraction f21,Fraction f22)
	{
		matrixFrac = new Fraction[3][3];
		matrixFrac[0][0] = f00;
		matrixFrac[0][1] = f01;
		matrixFrac[0][2] = f02;
		matrixFrac[1][0] = f10;
		matrixFrac[1][1] = f11;
		matrixFrac[1][2] = f12;
		matrixFrac[2][0] = f20;
		matrixFrac[2][1] = f21;
		matrixFrac[2][2] = f22;
	}
	
	/** To set the value of a particular element of the matrix */
	
	public void setElement(Fraction frac, int row, int column) 
	{
		matrixFrac[row][column] = frac;
	}
	
	/** To get the value of a particular element of the matrix */
	
	public Fraction getElement(int row, int column)  
	{
		return matrixFrac[row][column];
	}
	
	
	
	 public Fraction determinant() 
	{
		 return Fraction.add(Fraction.add(Fraction.multiply(matrixFrac[0][0] , Fraction.subtract(Fraction.multiply(matrixFrac[1][1],matrixFrac[2][2]) , Fraction.multiply(matrixFrac[2][1],matrixFrac[1][2]) ) ), Fraction.multiply(matrixFrac[0][1] , Fraction.subtract(Fraction.multiply(matrixFrac[1][0],matrixFrac[2][2]), Fraction.multiply(matrixFrac[2][0],matrixFrac[1][2])) )), Fraction.multiply(matrixFrac[0][2] , Fraction.subtract(Fraction.multiply(matrixFrac[1][0],matrixFrac[2][1]) , Fraction.multiply(matrixFrac[1][1],matrixFrac[2][0]) )));
	}
	
	

	public MatrixFraction transpose() 
	{
		int i,j;
		MatrixFraction tmf = new MatrixFraction(); 
		for(i=0,j=0;i<3 && j<3;i++,j++)
		{
			 tmf.setElement(matrixFrac[i][j],j,i) ;
		}
		return tmf;
	}
	
	
	//public boolean isIdentity() 
	//{
		
	//}
	
	/*
	public boolean isUpperTriangular() 
	{
	// Your code hereFraction.
	}
	
	
	public boolean isLowerTriangular()
	{
	// Your code here
	}
	
	
	public boolean isSame(MatrixFraction mFrac) 
	{
	// Your code here
	}
	
	
	
	public MatrixFraction add(MatrixFraction mFrac) 
	{
	// Your code here
	}
	
	
	public MatrixFraction subtract(MatrixFraction mFrac) 
	{
	// Your code here
	}
	
	
	
	public MatrixFraction multiply(MatrixFraction mFrac) 
	{
	// Your code here
	}
	

	
	public MatrixFraction scalarMultiply(int scalar)
	{
		
	}
	
	*/
	public boolean scalar() 
	{
		if(matrixFrac[0][0] == matrixFrac[1][1] && matrixFrac[0][0] == matrixFrac[2][2] && matrixFrac[0][1] == matrixFrac[0][2] &&  matrixFrac[1][0] == matrixFrac[1][2] && matrixFrac[2][1] == matrixFrac[2][0] && matrixFrac[0][1].ZeroFraction() && matrixFrac[1][0].ZeroFraction() && matrixFrac[2][0].ZeroFraction()  );
			return true;
	
	} 

}
