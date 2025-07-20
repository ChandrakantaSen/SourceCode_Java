import java.util.*;

class ParameterizedConstructor
{
	int x;
	
	ParameterizedConstructor(int m)
	{
		x = m;
	}
	
	public static void main (String[] args) 
	{
		ParameterizedConstructor PCobj = new ParameterizedConstructor(111);
		
		System.out.println("Required Value is: " + PCobj.x);
	}
}