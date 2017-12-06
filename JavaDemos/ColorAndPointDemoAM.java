import java.awt.*;      //both Color and Point are in java.awt

public class ColorAndPointDemoAM
{
	public static void main(String[ ] args)
	{
		Color myColor = new Color(0, 200, 0);    // lighter green
		Color aGreen = Color.GREEN;

		Point myPoint = new Point(5, 6);
		Point aPoint = new Point();

		System.out.println(myColor);    //automatically calls myColor.toString()

		System.out.println(myPoint);
		System.out.println("The x-value of " + myPoint + " is " + myPoint.getX());
	}
}
