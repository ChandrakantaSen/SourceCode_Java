// example of exception.
class arithmitic_exception
{
	public static void main(String args[])
	{
		int a=5,b=10,c;
		try
		{
		 c=a/b;
		 System.out.println("RESULT IS ="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by ZERO Error");
		}
		System.out.println("End of Program");
	}
}
