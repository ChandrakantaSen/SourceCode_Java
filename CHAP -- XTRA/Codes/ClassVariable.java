class ClassVariableTest
{
    static int c=10;
	static int addition(int a,int b)
        {
               return a/b;
        }
}
class ClassVariable
{
	public static void main(String args[])
	{
		int x=ClassVariableTest.addition(13,5);
		System.out.print("the sum is ="+x+"\n");
	}
}



