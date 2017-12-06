//This class will be a Circle

public class Circle
{
	// -------- data
	//private int x;
	//private int y;
	private Point center;  //now an aggregate class because it contains a Point (a class)
	private int radius;

	// -------- constructors
	// default constructor - sets its initial x,y to  5,7   and its initial radius to 5
	public       Circle()
	{
		/*this.x = 5;
		this.y = 7;
		this.radius = 5;
		*/
		this(new Point(5,7), 5);    //calls the parameterized constructor
	}

	// parameterized constructor - sets its initial  x,y   and initial radius to what is received
//	public         Circle(int firstX, int firstY, int firstRadius)
	public         Circle(Point firstCenter, int firstRadius)

	{
		if (firstRadius <= 0)    //bad
			throw new IllegalArgumentException("can't have a radius <= 0");

//		this.x = firstX;
//		this.y = firstY;
		this.center = firstCenter;
		this.radius = firstRadius;
	}


	// -------- methods
	//toString - returns it representation as a String
	//					this can be whatever you want...
	public String toString()
	{
//		return "Circle: (" + x + ", " + y + ")   radius: " + radius;
		return "Circle: " + center + "   radius: " + radius;

	}

	//getDiameter - returns the diameter as an int
	public int getDiameter()
	{
		return this.radius*2;
	}

	//getArea - returns the area as a double
	public double getArea()
	{
		return Math.PI * this.radius * this.radius;   //Math.pow(this.radius, 2)
	}

	//translate - "moves" this Circle by whatever xdistance and ydistance are received
	//					it does not return anything - just changes the center's x and y
	public void translate(int xdistance, int ydistance)
	{
//		this.x = this.x + xdistance;
//		this.y = this.y + ydistance;
		this.center.translate(xdistance, ydistance);
	}

	//sameAs - returns true if the Circle that is received is the same, false otherwise
	public boolean sameAs(Circle another)
	{
		/*if (	this.x == another.x	&&
				this.y == another.y	&&
				this.radius == another.radius)
			return true;
		else
			return false;
		*/

/*		return 	this.x == another.x	&&
					this.y == another.y	&&
					this.radius == another.radius;
*/

		//CANT USE == WITH AN INSTANCE OF A CLASS!!!!
		return 	this.center.sameAs(another.center) &&   //this.center == another.center &&
					this.radius == another.radius;
	}

}
