// demo program for all types of constructors.
class testing
{
	int a;
	int b;
	testing()   // default constructor
	{
		a=10;
		b=20;
	}
	testing(int x,int y)  // argument constructor
	{
		a=x;
		b=y;
	}
	testing(testing x) // copy constructor
	{
		a=x.a;
		b=x.b;
	}
	void show_data()
	{
		int c=a+b;
		System.out.println("The sum is = "+c);
	}
}
class constuctors
{
	public static void main(String args[])
	{
		testing obj1 = new testing();   // called default constructor
		obj1.show_data();
		testing obj2= new testing(3,4); // arguement constructor
		obj2.show_data();
		testing obj3= new testing(obj2); // copy constructor
		obj3.show_data();
	}
}