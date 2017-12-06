import java.util.*;

public class Program3
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int menuChoice = -1;
		int userInt;
		double answer = .99999999;
		Random numGen = new Random();

		System.out.println("Please enter a non-negative integer.");
		userInt = kb.nextInt();
		while(userInt < 0){
			System.out.println("Number cannot be negative!  Please enter a non-negative integer.");
				userInt = kb.nextInt();

		int backupUserInt = userInt;
		}
		do {

			System.out.println("Please choose an option");
			System.out.println("\t0\tPrint the number");
			System.out.println("\t1\tDetermine if the number is odd or even");
			System.out.println("\t2\tFind the reciprocal of the number");
			System.out.println("\t3\tFind half of the number");
			System.out.println("\t4\tRaise the number to the power of 5 (using a Java method)");
			System.out.println("\t5\tRaise the number to the power of 5 (using a loop)");
			System.out.println("\t6\tGenerate 20 random numbers between 0 and the number (inclusive)");
			System.out.println("\t7\tFind the sum of 0 up to your number (using a loop)");
			System.out.println("\t8\tFind the factorial of the number (using a loop)");
			System.out.println("\t9\tFind the square root of the number (using a Java method)");
			System.out.println("\t10\tFind the square root of the number (using a loop, Extra Credit)");
			System.out.println("\t11\tDetermine whether the number is prime (using a loop, Extra Credit)");
			System.out.println("\t12\tExit the program");

			menuChoice = kb.nextInt();
			switch(menuChoice){
				case 0://Print the number
					System.out.println("your number is " + userInt);
					break;
				case 1://Determine if the number is odd or even
					if(userInt%2==0) {
					System.out.println(userInt + " is even");
					} else {
					System.out.println(userInt + " is odd");
					}
					break;
				case 2: //Find the reciprocal of the number
					if(userInt==0) {
						System.out.println("There is no reciprocal of " + userInt);
					} else {
						System.out.println("The reciprocal of " + userInt + " is 1/" + userInt);
					}
					break;
				case 3://Find half of the number
					answer = (double)userInt/2;
					System.out.println("half of " + userInt + " is " + answer);
					break;
				case 4://Raise the number to the power of 5 (using a Java method)
					answer = Math.pow((double)userInt, 5);
					System.out.println(userInt + " to the power of 5 is " + answer);
					break;
				case 5://Raise the number to the power of 5 (using a loop)
					double exptVar = 1;
					double exponent = 5;
					for (int i = 1; i<=exponent; i++) {
							exptVar = exptVar*(double)userInt;
						}
						System.out.println(userInt + " to the power of 5 is " + exptVar);
					break;
				case 6://Generate 20 random numbers between 0 and the number (inclusive)
					System.out.println("Generating 20 random numbers between 0 and " + userInt + " (inclusive)");
					for(int i=0; i<=20; i++)
						System.out.println(numGen.nextInt(userInt+1));
					break;
				case 7://Find the sum of 0 up to your number (using a loop)
					int sum = 0;
					for (int i = 0; i <= userInt; i++) {
							sum += i;
						}
						System.out.println("The sum of 0 to " + userInt + " is " + sum);
					break;
				case 8://Find the factorial of the number (using a loop)
					long fact = 1;
					for(int i=1;i<=userInt;i++){
						fact=fact*i;
					}
					System.out.println("The factorial of "+ userInt +" is "+ fact);
					break;
				case 9://Find the square root of the number (using a Java method
					System.out.println("The square root of " + userInt + " is " + Math.sqrt((double)userInt));
					break;
				case 10://Find the square root of the number (using a loop, Extra Credit)
							 //I was unable to calculate down to the decimal but this will work for generalizations
						int i=1;
				        int iterations=1;
				        int curSum = 0;
				        do {
				            i+=2;
				            iterations++;
				            curSum +=i;
				        } while (curSum + i < userInt);
					System.out.println(iterations);
					break;
				case 11://Determine whether the number is prime (using a loop, Extra Credit)
							boolean isPrime = false;
					for(i = 2; i<=userInt; i++){
						if(userInt%i==0) {
							isPrime = true;
						} else {
							isPrime = false;
						}
					}
						if(isPrime==true) {
							System.out.println(userInt + " is a prime number");
						} else {
							System.out.println(userInt + " is not a prime number");
						}

					break;
				case 12://Exit the program
					break;
				case 13:
					System.out.print("Enter new user Integer: ");
						userInt = kb.nextInt();
				default:
					System.out.println("Illegal choice - try again");
					break;

				}
			} while (menuChoice !=12);



}
}
