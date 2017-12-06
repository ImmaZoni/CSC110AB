import java.awt.*;

public class ColorClassDemo
{
    public static void main(String[] args)
    {
        Color myColor = new Color(0,200,0); //Light Green
        Color aGreen = Color.GREEN;

        Point myPoint = new Point(5,6);
        Point aPoint = new Point();

        System.out.println(myColor);

        System.out.println(myPoint);
        System.out.println("The x-value of " + myPoint + " is " + myPoint.getX());

    }
}
