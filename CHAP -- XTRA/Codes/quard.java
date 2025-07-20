class base  // super class
{
	int length;
	int breath;
	base(int l,int b)   // base class constructor
	{
		length=l;
		breath=b;
	}
}
class quard extends base   // subclass class declaration
{
	int height;
	quard(int l,int b,int h)
	{
		super(b,l);	// transfer value to super class
		height=h;
	}
	void volume()
	{
		int area=length * breath * height;
		System.out.println("The Volume is = "+area);
	}
}
class inherit_constructor
{
	public static void main(String args[])
	{
		quard obj= new quard(7,9,5);  // calling constructor with value.
		obj.volume();
	}
}

