//This class will be a 2-dimensional Point

public class Point
{
	// -------- data
	private int x;
	private int y;

	// -------- constructors
	//default constructor - sets the initial  x,y  to 1,1
	public      Point()
	{
		//this.x = 1;
		//this.y = 1;
		this(1, 1);   //calls its own constructor, passing in 1,1
	}

	//parameterized constructor - sets the x,y to whatever is received
	public      Point(int firstX, int firstY)
	{
		this.x = firstX;
		this.y = firstY;
	}

	// -------- methods
	//toString - returns its representation as a String
	public String toString()
	{
		return "(" + this.x + ", " + this.y + ")";
	}

	//translate - "moves" this Point by whatever xdistance and ydistance are received
	//					it does not return anything - just changes the x and y
	public void translate(int xdistance, int ydistance)
	{
		this.x = this.x + xdistance;
		this.y = this.y + ydistance;
	}

	//distanceTo - returns the distance to the Point that is received
	public double distanceTo(Point another)
	{
		int xdiff = this.x - another.x;   //difference between their x values
		int ydiff = this.y - another.y;   //difference between their y values
		double theDistance = Math.sqrt(xdiff*xdiff + ydiff*ydiff);    //distance formula
		return theDistance;
	}

	//sameAs - returns true if the Point that is received is the same, false otherwise
	public boolean sameAs(Point another)
	{
		/*if (this.x==another.x && this.y==another.y)
			return true;
		else
			return false;
		*/
		return (this.x == another.x && this.y == another.y);
	}
}
