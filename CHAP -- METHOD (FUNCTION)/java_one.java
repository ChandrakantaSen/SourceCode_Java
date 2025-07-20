
import java.awt.*;
class sampletest()
{
	public static void main(String args[])
	{
		System.out.println("statement 1");
		simple();
		System.out.println("statement 2");
	}
	
	static void simple()
	{
		int x=10;
		x=x*10;
		System.out.println("statement 3");
		System.out.println("value of x: "+x);
	}
}
