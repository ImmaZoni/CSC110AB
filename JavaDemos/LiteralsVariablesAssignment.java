/*	"Literals" are values that are "hard-coded" so they never change.  Note the
	different types of literals:
		-->	"Hello World" is a String literal			(double quotes)
		-->	42 is an integer literal
		-->	3.14 is a decimal literal
		-->	'k' and '$' are character literals		(single quotes)
		-->	true and false are boolean literals	(true and false are keywords reserved for Java)

	"Variables" can store values and can be changed.  There are rules and conventions
	for variable names.
		-->	names must start with a letter and then can have any number of letters, digits,
				or underscores (_).   They are also called "identifiers" and the same rules apply
				to names of classes.
		-->	By convention, variable names start with lower case (remember, classes start
				with upper case)
		-->	if you want your variable name to be like 2 words, Java programmers write it like
				this:      totalValue
		-->	variable names should be MEANINGFUL.   totalValue is better than just tv for
				someone who is reading the code.
		-->	you cannot use Java keywords as your variable names (public, void, class, true, etc
				are illegal)

		There are 8 different "primitive types," whose values can be stored in a variable.   They are:
		-->	int		an integer, stored in 4 bytes, or 32 bits.      USE THIS ONE!!!
		-->	long	a HUGE int.    Use this whenever you think an int might not be big enough
		-->	short	a smaller int, stored in 2 bytes, or 16 bits.
		-->	byte	very small int, stored in 1 byte, or 8 bits
		-->	char	a character.
		-->	boolean		a boolean (true or false)
		-->	double	a decimal number     USE THIS ONE!!!
		-->	float		a smaller decimal number

		String is not a primitive type.   It is a class.   The difference is extremely important and will
		be covered soon.

		Assignment statements use an = sign.   It evaluates what is on the right hand side and
		puts it into the variable that is on the left hand side.

		See the demo below for how to declare and use variables.
*/

public class LiteralsVariablesAssignment
{
	public static void main(String[ ] args)
	{
		int age;		//"declares" an int named age.   You must have declaration before use.
							//a variable is "visible" within its "scope."   (the { }'s in which it is declared)
		age = 21;
		age = 50;
		age = age + 1;		//once declared, you can use or change it.
		System.out.println("My age is: " + age);      //Java evaluates age and then prints

		double gpa = 3.73;	//you can declare and "initialize" a variable in the same statement.
		System.out.print("My current gpa is: " + gpa + " out of " + 4.0);   //note String literals,
																															//double variable, double literal
		double anotherGPA = 2.56;
		gpa = anotherGPA;		//assignment statement

		System.out.print("My current gpa is: " + gpa + " out of " + 4.0);   //note String literals,
																															//double variable, double literal

		gpa = anotherGPA = 3.1;	//it will set both variables to 3.1



	}
}
