// NegativeSqrtException will be an exception for when users try to calculate
// the square root of a negative number.   It will work just like IllegalArgumentException
// but just has a different name.

public class NegativeSqrtException extends IllegalArgumentException
{
	//data - its all inherited

	//constructors - not inherited so we have to write our own.  But...it will just act like
	// the parent class
	public NegativeSqrtException(String str)    //user can pass in a String
	{
		super(str);     //do the same thing as its parent would do if it received the str
	}

	// methods - all inherited
}
