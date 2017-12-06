public class DateDriver
{
	public static void main(String[] args)
	{
		/*
		Date today = new Date();
		System.out.println(today.toString());

		String theMonth = today.getMonth();
		System.out.println(theMonth);

		today.setMonth("February");
		today.setDay(29);
		System.out.println(today.isLeapDay());
		*/
		Date today = new Date();
		Date independence = new Date("July", 4, 1776);
		System.out.println(independence.isLeapDay() + "\t\t\t"+ today);
	}
}