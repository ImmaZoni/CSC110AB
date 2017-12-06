/* Arrays are good because they are FAST

	but...there are some problems with arrays
	1.	if an array fills up, YOU have to make it bigger
		by creating a temporary one, copying in the data, and
		reseting the name.
		    ITS A PAIN...

	2.	If you want to add something into the middle of it
		you have to move everything over to make room
			ITS A PAIN...

	3. If you want to remove from the middle, you have to
		fill it in by moving everything over.
			ITS A PAIN...

	ArrayLists do all of these things automatically!!!
*/

import java.util.*;

public class ArrayListDemo
{
	public static void main(String[ ] aaaargs)
	{
		//create a new ArrayList
		ArrayList myAL = new ArrayList();     //automatically holds Objects (or any subclass)
		//ArrayList<String> myAL = new ArrayList<String>();     //new holds Strings (or any subclass)

		//tell it to add people to itself
		myAL.add("Jacob");
		myAL.add("Anthony");
		myAL.add("Chantal");
		myAL.add(1, "Tran");
		//myAL.add(new Date());
		myAL.remove(0);    //removes whoever is in slot 0

		//String firstone = myAL.get(0);     //at compile time, java thinks .get(0) will return an Object
		String firstone = (String)myAL.get(0);     //so have to typecast it

		//lets look at it...
		System.out.println("size is: " + myAL.size());
		System.out.println("is it empty? " + myAL.isEmpty());
		System.out.println(myAL.toString());     //toString automatically called
	}
}



