//This class will test the Circle class

public class CircleTester
{
	public static void main(String[ ] args)
	{
		//test constructors
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(new Point(3,1), 7);
		Circle circle2Copy = new Circle(new Point(3,1), 7);

		//test toString
		System.out.println("Circle created with default constructor is:   " + circle1);
		System.out.println("Circle created with parameterized constructor(3, 1, 7) is:   " + circle2);
		System.out.println("different Circle created with parameterized constructor(3, 1, 7) is:   " + circle2Copy);

		//testing getDiameter
		System.out.println("\nTelling " + circle1 + " to .getDiameter().   It returns:  " + circle1.getDiameter());
		System.out.println("Telling " + circle2 + " to .getDiameter().   It returns:  " + circle2.getDiameter());

		//testing getArea
		System.out.println("\nTelling " + circle1 + " to .getArea().   It returns:  " + circle1.getArea());
		System.out.println("Telling " + circle2 + " to .getArea().   It returns:  " + circle2.getArea());

		//testing sameAs
		System.out.println("\nAsking " + circle1 + " if it is the .sameAs " + circle2 + "  It returned: " + circle1.sameAs(circle2));
		System.out.println("Asking " + circle2 + " if it is the .sameAs " + circle2Copy + "  It returned: " + circle2.sameAs(circle2Copy));

		//testing translate
		System.out.println("\nTelling " + circle1 + " and " + circle2 + " to translate(4, -2)");
		circle1.translate(4, -2);
		circle2.translate(4, -2);
		System.out.println("circle1 is now:   " + circle1);
		System.out.println("circle2 is now:   " + circle2);


		System.out.println();   //for separation
	}
}
