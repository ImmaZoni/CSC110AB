// This class describes a drawable "Tank"

import java.awt.*;
import java.util.*;
import javax.swing.*;    //for JOptionPane

public class Tank extends java.awt.Rectangle       //subclass of Rectangle so we can use its intersects method
{
	// ---------------- constants
	private final int MAXSHELLS = 4;
	private final int TANKWIDTH = 30;
	private final int MAXSPEED = 30;     // 30;
	private final int MINSPEED = 1;      // 0;

	// ---------------- data (note: x, y, height, width will be inherited from Rectangle)
	private boolean leaveTrail;
	private Segment currentSegment;
	private ArrayList<Segment> segRoute;
	private Color color;
	private int delay;
	private boolean reverseGear;
	private Graphics g;
	private Direction orientation;
	private int numShells;
	private boolean loaded;

	// -------------- constructors
	//default constructor - sets it to Black and VERY slow
	public Tank()
	{
		this(Color.BLACK, 1);      //call the other constructor passing in BLACK and 1
	}

	//"parameterized constructor" - receives a color and a speed
	public Tank(Color theColor, int theSpeed)
	{
		this(theColor, theSpeed, false);
	}

	//"parameterized constructor" - receives a color and a speed, and trail indicator
	public Tank(Color theColor, int theSpeed, boolean leaveTrail)
	{
		//if the speed is legal, set it (actually the delay value to the timer).
		//If illegal, tell user and set it so something slow
		if (theSpeed < MINSPEED || theSpeed > MAXSPEED)
		{
			JOptionPane.showMessageDialog(null, "Tank's speed must be between " + MINSPEED + " and " + MAXSPEED, "Illegal speed for Tank", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		else
			delay = MAXSPEED-theSpeed+1;   //the faster the speed, the slower the delay

		//initialize various data
		this.leaveTrail = leaveTrail;
		this.currentSegment = new Segment(x, y, orientation);   //current Segment starts at currrent (x,y)
		segRoute = new ArrayList<Segment>();
		color = theColor;
		numShells = MAXSHELLS;
		loaded = false;
		reverseGear = false;
		width = height = TANKWIDTH;       //Tank's bounding rectangle will be TANKWIDTH x TANKWIDTH
		orientation = Direction.UP;
	}

	// ---------------- methods
	// move - changes its position by 1 pixel (depending on the orientation)
	public void move()
	{
		//if moving forward in reverse...
		if (reverseGear)
		{
			if (orientation == Direction.UP)
				y++;
			else if (orientation == Direction.DOWN)
				y--;
			else if (orientation == Direction.LEFT)
				x++;
			else if (orientation == Direction.RIGHT)
				x--;
		}
		else    //if moving forward...
		{
			if (orientation == Direction.UP)
				y--;
			else if (orientation == Direction.DOWN)
				y++;
			else if (orientation == Direction.LEFT)
				x--;
			else if (orientation == Direction.RIGHT)
				x++;
		}

		//go to sleep to slow down animation (based on its speed)
		try{ Thread.sleep(delay); }
		catch(Exception ex) {}
	}

	// reverse - "engages reverse gear"
	public void reverse()
		{
			//if it was not previously in reverse, start a new Segment
			if (!reverseGear)
			{
				//finish the currentSegment and put it into the ArrayList
				currentSegment.endSegment(x,y);
				if (currentSegment.x1 != 0 && currentSegment.y1 != 0)
					segRoute.add(currentSegment);    //don't add initial Segment - it had (0,0) as start

				//since it has gone in reverse, create a new currentSegment for the next "leg"
				currentSegment = new Segment(x, y, orientation);
			}

			reverseGear = true;
		}

	// forward - turns off reverse gear so it moves forward
	public void forward()
		{
			//if it was previously in reverse, start a new Segment since it is new going forward
			if (reverseGear)
			{
				//finish the currentSegment and put it into the ArrayList
				currentSegment.endSegment(x,y);
				if (currentSegment.x1 != 0 && currentSegment.y1 != 0)
					segRoute.add(currentSegment);    //don't add initial Segment - it had (0,0) as start

				//since it has gone in reverse, create a new currentSegment for the next "leg"
				currentSegment = new Segment(x, y, orientation);
			}

			reverseGear = false;
		}

	// setPosition - sets its x and y position to whatever is passed in
	//                       FOR LANDSCAPE CLASS, NOT TO BE USED BY STUDENTS
	public void setPosition(int newX, int newY)
	{
		x = newX;
		y = newY;
	}

	// getPositionX - returns its x coordinate
	public int getPositionX()
	{
		return x;
	}

	// getPositionY - returns its y coordinate
	public int getPositionY()
	{
		return y;
	}

	// getDimension - returns the dimension (both length and width, since its a square)
	public int getDimension()
	{
		return (int)getWidth();      //calls parent class (Rectangle's) getWidth, but returns as int
	}

	// setColor - sets its color to whatever is passed in
	public void setColor(Color newColor)
	{
		color = newColor;
	}

	// turn - "turns" by changing its orientation
	public void turn(String whichWay)
	{
		whichWay = whichWay.trim();   //trim off any leading/trailing white space

		if (whichWay.equalsIgnoreCase("left"))
		{
			if (orientation == Direction.UP)
				orientation = Direction.LEFT;
			else if (orientation == Direction.DOWN)
				orientation = Direction.RIGHT;
			else if (orientation == Direction.LEFT)
				orientation = Direction.DOWN;
			else if (orientation == Direction.RIGHT)
				orientation = Direction.UP;
		}
		else if (whichWay.equalsIgnoreCase("right"))
		{
			if (orientation == Direction.UP)
				orientation = Direction.RIGHT;
			else if (orientation == Direction.DOWN)
				orientation = Direction.LEFT;
			else if (orientation == Direction.LEFT)
				orientation = Direction.UP;
			else if (orientation == Direction.RIGHT)
				orientation = Direction.DOWN;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Illegal turn: " + whichWay + " (only \"left\" and \"right\" allowed)", "Start Over", JOptionPane.INFORMATION_MESSAGE);
			throw new IllegalArgumentException("Illegal turn: " + whichWay + " (only \"left\" and \"right\" allowed)");
		}

		//finish the currentSegment and put it into the ArrayList
		currentSegment.endSegment(x,y);
				if (currentSegment.x1 != 0 && currentSegment.y1 != 0)
					segRoute.add(currentSegment);    //don't add initial Segment - it had (0,0) as start

		//since it has turned, create a new currentSegment for the next "leg"
		currentSegment = new Segment(x, y, orientation);
	}

	//toString - returns its representation as a String
	public String toString()
	{
		return "Tank at: (" + x + ", " + y + ")  orientation: " + orientation + "   size(each side): " + TANKWIDTH;
	}

	//draw - "draws itself" using whatever Graphics object is passed in
	public void draw(Graphics g)
	{
		final int xcutout = (int)(.4*TANKWIDTH);
		final int ycutout = (int)(.4*TANKWIDTH);

		//if leaveTrail is turned on, draw the trail)
		if (leaveTrail)
		{
			//first, draw every Segment that is stored (move the lines so they are centered on the tank)
			for (int i=0; i<segRoute.size(); i++)
			{
				Segment seg = segRoute.get(i);
				g.setColor(Color.GRAY);
				//if (seg.direction == Direction.UP || seg.direction == Direction.DOWN)
					g.drawLine(seg.x1+width/2, seg.y1+width/2, seg.x2+width/2, seg.y2+width/2);
				//else   //direction is LEFT or RIGHT
				//	g.drawLine(seg.x1+width/2, seg.y1+width/2, seg.x2+width/2, seg.y2+width/2);
			}

			//now draw the current Segment (since it has not been completed and stored in the ArrayList).  Use x,y for end
			//if (currentSegment.direction == Direction.UP || currentSegment.direction == Direction.DOWN)
				g.drawLine(currentSegment.x1+width/2, currentSegment.y1+width/2, x+width/2, y+width/2);
			//else   //direction is LEFT or RIGHT
			//	g.drawLine(currentSegment.x1, currentSegment.y1+width/2, x, y+width/2);
		}

		//draw the tank
		if (orientation == Direction.UP)
		{
			g.setColor(color);
			g.fillRect(x, y+ycutout, TANKWIDTH, TANKWIDTH-ycutout);
			g.fillRect(x+xcutout, y, TANKWIDTH-2*xcutout, ycutout);
		}
		else if (orientation == Direction.DOWN)
		{
			g.setColor(color);
			g.fillRect(x, y, TANKWIDTH, TANKWIDTH-ycutout);
			g.fillRect(x+xcutout, y+TANKWIDTH-ycutout, TANKWIDTH-2*xcutout, ycutout);
		}
		else if (orientation == Direction.LEFT)
		{
			g.setColor(color);
			g.fillRect(x+xcutout, y, TANKWIDTH-xcutout, TANKWIDTH);
			g.fillRect(x, y+ycutout, xcutout, TANKWIDTH-2*ycutout);
		}
		else if (orientation == Direction.RIGHT)
		{
			g.setColor(color);
			g.fillRect(x, y, TANKWIDTH-xcutout, TANKWIDTH);
			g.fillRect(x+TANKWIDTH-xcutout, y+ycutout, xcutout, TANKWIDTH-2*ycutout);
		}
	}

}

//*************************************************************
//------ Enumerated Data Type: a "DIRECTION" is restricted to these values
//        (note: as long as an enum or a class is not "public" it can be defined
//        in the same file as another class.   It is then restricted to that other class).
enum Direction
{  UP, DOWN, LEFT, RIGHT }

//*************************************************************
//------ Segment: will keep track of a "segment" of the Tank's route
class Segment
{
	//data
	protected Direction direction;
	protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;

	//constructors - starts a new Segment (just the x1 and y1 and which direction it is facing)
	public Segment(int x1, int y1, Direction direction)
	{
		startSegment(x1, y1, direction);
	}

	//methods

	//startSegment - starts the Segment by putting in the x1, y1 values and the direction it is facing
	public void startSegment(int x1, int y1, Direction direction)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = -1;
		this.y2 = -1;
		this.direction = direction;
	}

	//endSegment - completes the Segment by putting in the x2, y2 values
	public void endSegment(int x2, int y2)
	{
		this.x2 = x2;
		this.y2 = y2;
	}
}