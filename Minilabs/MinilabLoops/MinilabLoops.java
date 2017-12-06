/*This program was coded by Justin Hill on 10/5/17
   its intenetions are to take two integers from the user and then
   ask them what the two numbers should be divisable by*/


import java.util.*;

public class MinilabLoops
{
	public static void main(String[] args)
	{
		//Scanner class
			Scanner kb = new Scanner(System.in);

		//Initialize Variables
			int number1;
			int number2;
			int number3;

		//Ask user and store input
		System.out.print("Please enter 2 integers (separated by spaces): ");
			number1 = kb.nextInt();
			number2 = kb.nextInt();

		System.out.print("Please enter the integer your output should be divisible by: ");
			number3 = kb.nextInt();

		//While statement to prevent division by 0
		while (number3 <= 0){
			System.out.print("You cannot divide by 0: ");
			number3 = kb.nextInt();
		}

		//Main code logic
		if(number1 < number2){
			for(int i=number1; i<number2; i++){
				if(i%number3==0 && i != number1 && 1 != number2){
					System.out.println(i);
				}
			}
		} else {
			for(int i=number1; i>number2; i--){
				if(i%number3==0 && i != number1 && 1 != number2){
					System.out.println(i);
				}
		}
	}








	}
}
