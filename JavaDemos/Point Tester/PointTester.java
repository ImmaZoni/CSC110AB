//This class will test the Point class

public class PointTester
{
	public static void main(String[ ] args)
	{
		//test constructors
		Point start = new Point(1, 1);
		Point myPoint = new Point(4, -3);

		//test toString
		System.out.println("Point created with default constructor is:   " + start);
		System.out.println("Point created with parameterized constructor(4, -3) is:   " + myPoint);

		//testing distanceTo
		double distance = start.distanceTo(myPoint);
		System.out.println("\nThe distance between them is:   " + distance);

		//testing translate
		System.out.println("\nTelling them both to translate(4, -2)");
		start.translate(4, -2);
		myPoint.translate(4, -2);
		System.out.println("first Point is now:   " + start);
		System.out.println("second Point is now:   " + myPoint);

		System.out.println();   //for separation
	}
}
