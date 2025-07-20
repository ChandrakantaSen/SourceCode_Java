import java.util.*;

class DefaultConstructor
{
	int x;
	
	DefaultConstructor()
	{
		x = 999;
	}
	
	public static void main (String[] args) 
	{
		DefaultConstructor DCobj = new DefaultConstructor();
		
		System.out.println("Required Value is: " + DCobj.x);
	}
}