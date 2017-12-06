// This demo will show how an array can hold instances of
// a class or any of its subclasses.  At the bottom, it defines and
// gives an example of Polymorphism.

public class PolymorphismDEMO
{
	public static void main(String[ ] arg)
	{

		// create an array that will hold Humans.   IT WILL ALSO HOLD ANY
		// SUBCLASS OF HUMANS
		Human[ ] myArray = new Human[4];

		// fill the array - it holds Humans or any subclass
		myArray[0] = new Human();
		myArray[1] = new StudentAthlete();
		myArray[2] = new Student();
		myArray[3] = new StudentAthlete();
		myArray[4] = new Human();

		//we can go through the whole array, telling each element to getWeekendPlans()
		//they will each use their OWN method to do this
		//this is called "Polymorphism"
		for (int i=0; i<myArray.length; i++)
			System.out.println(myArray[i].getWeekendPlans());

/*
		//if you get something OUT of the array and assign it to a variable,
		//then Java assumes that what you got out of the array was the
		//type that was defined at compile time, which is Human
		Human firstElement = myArray[0];
		System.out.println("first element (in a variable) is:  " + firstElement);

		Student secondElement = (Student)myArray[1];   //Java assumes myArray[1] is a Human
		System.out.println("second element (in a variable) is:  " + secondElement);




*/
	}

}
