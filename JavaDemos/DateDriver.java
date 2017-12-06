public class DateDriver
{
	public static void main(String[ ] args)
	{
		//create a new instance of a Date
		Date today = new Date();

		//tell it to do things
		System.out.println("today's date is: " + today.toString());   //.toString called automatically
		System.out.println("today's date is: " + today);   //.toString called automatically

		today.setMonth("April");
		today.setDay(15);
		System.out.println(today);     //don't need the .toString
		System.out.println("today's month is now:  " + today.getMonth());
		System.out.println("today's day is now:  " + today.getDay());

		//--------------------------
		Date fireworksDay = new Date("July", 4, 1776);
	}
}
