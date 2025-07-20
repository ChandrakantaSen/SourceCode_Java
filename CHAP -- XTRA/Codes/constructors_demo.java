// example of constructor over loading.
class add_using_constructors
{
	int a;
	int b;
	add_using_constructors()   // default constructor
	{
		a=10;
		b=25;
	}
	add_using_constructors(int x,int y)   // argument constructor
	{
		a=x;
		b=y;
	}
	void show()
	{
		int c=a+b;
		System.out.println("Sum = "+c);
	}
}
class constructors_demo
{
	public static void main(String args[])
	{
		add_using_constructors obj1=new add_using_constructors();
		obj1.show();
		System.out.println("----------------");
		add_using_constructors obj2=new add_using_constructors(8,9);
		obj2.show();
	}
}
