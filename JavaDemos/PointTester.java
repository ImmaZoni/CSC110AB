//This class will test the Point class

public class PointTester
{
	public static void main(String[ ] args)
	{
		//test constructors
		Point start = new Point();
		Point myPoint = new Point(4, -3);
		Point myPointCopy = new Point(4, -3);

		//test toString
		System.out.println("Point created with default constructor is:   " + start);
		System.out.println("Point created with parameterized constructor(4, -3) is:   " + myPoint);
		System.out.println("different Point created with parameterized constructor(4, -3) is:   " + myPointCopy);

		//testing distanceTo
		double distance = start.distanceTo(myPoint);
		System.out.println("\nThe distance between " + start + " and " + myPoint + " is:   " + distance);

		//testing sameAs
		System.out.println("\nAsking " + start + " if it is the .sameAs " + myPoint + "  returned: " + start.sameAs(myPoint));
		System.out.println("Asking " + myPointCopy + " if it is the .sameAs " + myPoint + "  returned: " + myPointCopy.sameAs(myPoint));

		//testing translate
		System.out.println("\nTelling " + start + " and " + myPoint + " to translate(4, -2)");
		start.translate(4, -2);
		myPoint.translate(4, -2);
		System.out.println("first Point is now:   " + start);
		System.out.println("second Point is now:   " + myPoint);


		System.out.println();   //for separation
	}
}
