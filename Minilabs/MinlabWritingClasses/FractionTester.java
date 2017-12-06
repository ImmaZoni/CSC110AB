public class FractionTester
{
	public static void main(String[] args)
	{
		//create and test Fractions
		System.out.println("------ Part1: Testing Fractions's constructors and toString()");

		System.out.println("\nTest1.1: Testing default constructor, then toString()");
		try
		{
			System.out.print("expected: 0/1 \ngot:      ");
			Fraction f1 = new Fraction();
			System.out.println(f1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.2: Testing new Fraction(2) constructor, then toString()");
		try
		{
			System.out.print("expected: 2/1 \ngot:      ");
			Fraction f1 = new Fraction(2);
			System.out.println(f1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}


		System.out.println("\nTest1.3: Testing new Fraction(2, 5) constructor, then toString()");
		try
		{
			System.out.print("expected: 2/5 \ngot:      ");
			Fraction f1 = new Fraction(2, 5);
			System.out.println(f1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.4: Testing new Fraction(2, 0) constructor (bad input), then toString()");
		try
		{
			System.out.print("expected: java.lang.IllegalArgumentException(<your descriptive String>) \ngot:      ");
			Fraction f1 = new Fraction(2, 0);
			System.out.println(" no exception");
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		System.out.println("\nTest1.5: Testing new Fraction(0, 2) constructor (OK), then toString()");
		try
		{
			System.out.print("expected: 0/2 \ngot:      ");
			Fraction f1 = new Fraction(0, 2);
			System.out.println(f1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}


		System.out.println("\n------ Part2: Testing Fraction's methods");

		System.out.println("\nTest2.1: Testing .evaluate with 3/4   (original should be unchanged)");
		try
		{
			System.out.print("expected: 0.75 \ngot:      ");
			Fraction f1 = new Fraction(3,4);
			String originalToString = f1.toString();
			double result = f1.evaluate();
			System.out.println(result);

			if (!originalToString.equals(f1.toString()))
				System.out.println("***** BUT THE ORIGINAL FRACTION CHANGED");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest2.2: Testing .isImproper with 7/6   (original should be unchanged)");
		try
		{
			System.out.print("expected: true \ngot:      ");
			Fraction f1 = new Fraction(7,6);
			String originalToString = f1.toString();
			boolean result = f1.isImproper();
			System.out.println(result);

			if (!originalToString.equals(f1.toString()))
				System.out.println("***** BUT THE ORIGINAL FRACTION CHANGED");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest2.3: Testing .isImproper with 10/13   (original should be unchanged)");
		try
		{
			System.out.print("expected: false \ngot:      ");
			Fraction f1 = new Fraction(10,13);
			String originalToString = f1.toString();
			boolean result = f1.isImproper();
			System.out.println(result);

			if (!originalToString.equals(f1.toString()))
				System.out.println("***** BUT THE ORIGINAL FRACTION CHANGED");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest2.4: Testing .isImproper with 7/7   (original should be unchanged)");
		try
		{
			System.out.print("expected: false \ngot:      ");
			Fraction f1 = new Fraction(7,7);
			String originalToString = f1.toString();
			boolean result = f1.isImproper();
			System.out.println(result);

			if (!originalToString.equals(f1.toString()))
				System.out.println("***** BUT THE ORIGINAL FRACTION CHANGED");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest2.5: Testing .multiply  4/5 times 3/11   (original should be unchanged)");
		try
		{
			System.out.print("expected: 12/55 \ngot:      ");
			Fraction f1 = new Fraction(4, 5);
			String originalf1ToString = f1.toString();
			Fraction f2 = new Fraction(3, 11);
			String originalf2ToString = f2.toString();

			Fraction f3 = f1.multiply(f2);
			System.out.println(f3);

			if (!originalf1ToString.equals(f1.toString()) || !originalf2ToString.equals(f2.toString()))
				System.out.println("***** BUT THE ORIGINAL FRACTION(S) WERE CHANGED!");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

	}   //end of main
}  //end of class
