import java.util.*;

class Avg
{
	int a, b, c;
	Scanner in = new Scanner(System.in);

	void getData()
	{
		System.out.println("Enter first number: ");
		a = in.nextInt();
		System.out.println("Enter second number: ");
		b = in.nextInt();
	}

	void calculate()
	{
		c = (a + b);
	}

	void printData()
	{
		System.out.println("Sum is: " + c);
	}
}

class AverageNumber
{
	public static void main (String[] args)
	{
		Avg Aobj = new Avg();

		Aobj.getData();
		Aobj.calculate();
		Aobj.printData();

	}
}