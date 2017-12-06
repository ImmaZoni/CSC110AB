//This is the driver for the inheritance demo.   It uses 3 related classes -
//            Human, Student, and StudentAthlete

public class InheritanceDriver
{
	public static void main(String[ ] args)
	{
		Human myHuman = new Human();
		System.out.println(myHuman.toString());   //automatically calls toString()
		System.out.println("weekend plans are: " + myHuman.getWeekendPlans());

		System.out.println("\n\n");

		Student myStudent = new Student();
		System.out.println(myStudent);
		System.out.println("weekend plans are: " + myStudent.getWeekendPlans());

		System.out.println("\n\n");

		StudentAthlete myStudAthlete = new StudentAthlete();
		System.out.println(myStudAthlete);
		System.out.println("weekend plans are: " + myStudAthlete.getWeekendPlans());


	}
}
