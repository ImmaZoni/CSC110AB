public class Box extends Rectangle
{
  //-------- data
  protected int dimension3;    //hight

  //-------- constructors
  //default constructor
  public Box()
  {
    this.dimension1 = 5;
    this.dimension2 = 2;
    this.dimension3 = 6;
  }

  //parameterized constructor
  public Box(int theDim1, int theDim2, int theDim3)
  {
    if (theDim1 < 0 || theDim2 < 0 || theDim3 < 0)
      throw new IllegalArgumentException("a dimension cannot be negative");

    this.dimension1 = theDim1;
    this.dimension2 = theDim2;
    this.dimension3 = theDim3;
  }

  //methods

  public String toString() //Generates a String
  {
    return this.getClass().getName() + ": " + dimension1 + "x" + dimension2 + "x" + dimension3;
  }

  public int getPerimeter() //Exception, left over from parent class.
  {
      throw new IllegalStateException("Cannot have a perimeter of a Box");
  }

  public boolean isReallyALine() //if all but one dimension is 0 returns true
	{
		if (	(this.dimension1 != 0 && this.dimension2 == 0 && this.dimension3 == 0) ||
		    	(this.dimension2 == 0 && this.dimension2 != 0 && this.dimension3 == 0)  ||
          (this.dimension1 == 0 && this.dimension2 == 0 && this.dimension3 != 0)  )
		    return true;
		else
			return false;
	}

  public boolean isACube()  //if all dimension are equal returns true.
  {
    if( (this.dimension1 == this.dimension2) &&
        (this.dimension2 == this.dimension3) &&
        (this.dimension1 == this.dimension3) )
      return true;
    else
      return false;
  }
}
