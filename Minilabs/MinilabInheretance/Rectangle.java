/*	This class will represent a rectangle.   It has 2 dimensions, which are
	called dimension1 and dimension2.
*/

public class Rectangle
{
	//-------- data
	protected int dimension1;    //length
	protected int dimension2;    //width

	//-------- constructors
	//default constructor
	public Rectangle()
	{
		this.dimension1 = 5;
		this.dimension2 = 2;
	}

	//parameterized constructor
	public Rectangle(int theDim1, int theDim2)
	{
		if (theDim1 < 0 || theDim2 < 0)
			throw new IllegalArgumentException("a dimension cannot be negative");

		this.dimension1 = theDim1;
		this.dimension2 = theDim2;
	}

	//-------- methods
	//toString - returns its representation as a String
	//                (the this.getClass().getName() will evaluate to "Rectangle" here
	public String toString()
	{
		return this.getClass().getName() + ": " + dimension1 + "x" + dimension2;
	}

	//getPerimeter - returns the perimeter
	public int getPerimeter()
	{
		return 2*dimension1 + 2*dimension2;
	}

	//isReallyALine - returns true if only 1 dimension is 0 (which is legal),
	//                         so it is "squashed" into a line
	public boolean isReallyALine()
	{
		if (	(this.dimension1 == 0 && this.dimension2 != 0) ||
		    	(this.dimension2 != 0 && this.dimension2 == 0)  )
		    return true;
		else
			return false;
	}
}
