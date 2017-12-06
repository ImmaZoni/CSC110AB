//This class was writen by Justin Hill on 11/8/17
//Its uses are to accept a numerator and denominator and perform basic Fraction functions
public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction() //Default Constructor
    {
        this.numerator = 0;
        this.denominator = 1;
    }
    public Fraction(int userNumerator) //Numerated Constructor
    {
        this.numerator = userNumerator;
        this.denominator = 1;
    }
    public Fraction(int userNumerator, int userDenominator) //Full Constructor
    {
        if (userDenominator <= 0)
            throw new IllegalArgumentException("denominator must be positive!!!!");
        else
        this.numerator = userNumerator;
        this.denominator = userDenominator;
    }

    public String toString() //To String Meathod
    {
        return numerator + "/" + denominator;
    }
    public double evaluate() //Evaluate Meathod
    {
        return (double)numerator/(double)denominator;
    }
    public boolean isImproper() //Improper Meathod
    {
        if(numerator > denominator)
            return true;
        else
            return  false;
    }
    public Fraction multiply(Fraction another) //Multiply Meathod
    {
        return new Fraction(this.numerator*another.numerator, this.denominator*another.numerator);
    }

}
