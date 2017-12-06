public class QuickTest
{
	public static void main(String[ ] args)
	{
		String today = "Thursday";
		int month = 9;

		//if (today == "Monday")      //DONT USE == FOR A CLASS (like String)
		if (today.equals("Monday"))
			if (month == 10)				// ONLY USE IT FOR PRIMITIVE TYPES
				System.out.println("It is a Monday in October");
		else
			System.out.println("It is not Monday");

	}
}
