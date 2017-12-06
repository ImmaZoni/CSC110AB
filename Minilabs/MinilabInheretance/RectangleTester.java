//This class will test Rectangles

public class RectangleTester
{
	public static void main(String[ ] args)
	{
		//testing default constructor
		Rectangle myRect = new Rectangle();
		System.out.println(myRect);
		System.out.println("the perimeter is: " + myRect.getPerimeter());
		System.out.println("is it really a line: " + myRect.isReallyALine());

		//testing parameterized constructor
		System.out.println();
		Rectangle anotherRect = new Rectangle(7, 3);
		System.out.println(anotherRect);
		System.out.println("the perimeter is: " + anotherRect.getPerimeter());
		System.out.println("is it really a line: " + anotherRect.isReallyALine());

		//testing Rectangle with one 0 dimension
		System.out.println();
		Rectangle squashedRect = new Rectangle(0, 3);
		System.out.println(squashedRect);
		System.out.println("the perimeter is: " + squashedRect.getPerimeter());
		System.out.println("is it really a line: " + squashedRect.isReallyALine());

		//testing Rectangle with the other 0 dimension
		System.out.println();
		Rectangle squashedRect2 = new Rectangle(5, 0);
		System.out.println(squashedRect2);
		System.out.println("the perimeter is: " + squashedRect2.getPerimeter());
		System.out.println("is it really a line: " + squashedRect2.isReallyALine());

		//testing Rectangle with both 0 dimensions
		System.out.println();
		Rectangle pointRect = new Rectangle(0, 0);
		System.out.println(pointRect);
		System.out.println("the perimeter is: " + pointRect.getPerimeter());
		System.out.println("is it really a line: " + pointRect.isReallyALine());

		//testing Rectangle with one negative dimension
		try
		{
			System.out.println();
			Rectangle badRect = new Rectangle(6, -2);
			System.out.println(badRect);
			System.out.println("the perimeter is: " + badRect.getPerimeter());
			System.out.println("is it really a line: " + badRect.isReallyALine());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}

		//testing Rectangle with the other negative dimension
		try {
			System.out.println();
			Rectangle badRect2 = new Rectangle(-4, 3);
			System.out.println(badRect2);
			System.out.println("the perimeter is: " + badRect2.getPerimeter());
			System.out.println("is it really a line: " + badRect2.isReallyALine());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}
}
