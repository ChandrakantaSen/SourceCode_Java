class ClassVariable
{
	static int addition(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
}
class ClassVariableTest
{
	public static void main(String args[])
	{
		int x=ClassVariable.addition(3,5);
		System.out.print("the sum is ="+x+"\n");
	}
}



