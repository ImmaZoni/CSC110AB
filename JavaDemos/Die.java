//This class represents a Die (half a set of dice)

import java.util.*;     //for Random

public class Die
{
	//-------- data
	private int numSides;

	//-------- constructors
	//default constructor - sets the number of sides to 6
	public Die()
	{
		numSides = 6;
	}

	//parameterized constructor - sets the number of sides to whatever is passed in.  Throws an
	//    exception if number of sides if < 4
	public Die(int newSides)
	{
		if (newSides < 4)
			throw new IllegalArgumentException("number of sides cannot be less than 4");
		this.numSides = newSides;
	}

	//-------- methods
	//roll - rolls the Die by returning a random number between 1 and numSides
	public int roll()
	{
		Random generator = new Random();
		return generator.nextInt(numSides)+1;   //generator.nextInt(numSides) returns random in range 0 to numSides-1
	}

	//getNumSides - returns the number of sides
	public int getNumSides()
	{
		return numSides;
	}
}
