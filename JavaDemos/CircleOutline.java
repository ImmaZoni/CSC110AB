//This class will be a Circle

public class Circle
{
	// -------- data
	private int centerx;
	private int centery;
	private int radius;

	// -------- constructors
	// default constructor - sets its initial x,y to  5,7   and its initial radius to 5
	public     Circle()
	{
		this(5, 7, 5);     //or could set them individually
	}


	// parameterized constructor - sets its initial  x,y   and initial radius to what is received
	public        Circle(int firstX, int firstY, int firstRadius)
	{
		if (firstRadius < 0)
			throw new IllegalArgumentException("radius cannot be negative");
		this.x = firstX;
		this.y = firstY;
		this.radius = firstRadius;
	}


	// -------- methods
	//toString - returns it representation as a String
	//					this can be whatever you want...
	public String toString()
	{
		return "Circle with center (" + x + ", " + y + ")  and radius " + radius;
	}

	//getDiameter - returns the diameter as an int
	public int getDiameter()
	{
		return 2*radius;
	}

	//getArea - returns the area as a double
	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	//translate - "moves" this Center by whatever xdistance and ydistance are received
	//					it does not return anything - just changes the center's x and y
	public void translate(int xmove, int ymove)
	{
		x = x + xmove;
		y = y + ymove;
	}

	//sameAs - returns true if the Circle that is received is the same, false otherwise
	public boolean sameAs(Circle another)
	{
		return 	this.x == another.x &&
					this.y == another.y &&
					this.radius == another.radius;
	}

}
