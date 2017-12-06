import java.awt.*;

public class ColorAndPointDemoPM
{
	public static void main(String[ ] args)
	{
		Color myColor = new Color(0, 200, 0);    //in RGB, light-ish green
		Color aColor = Color.GREEN;
		System.out.println(aColor);     //automatically going to call aColor.toString()

		Point myPoint = new Point();
		System.out.println(myPoint);

		Point aPoint = new Point(5, 3);
		System.out.println(aPoint);
		int theX = (int)aPoint.getX();
	}
}
