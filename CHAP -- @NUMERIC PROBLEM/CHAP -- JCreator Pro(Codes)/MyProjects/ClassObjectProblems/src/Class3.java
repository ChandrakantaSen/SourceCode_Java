/**
 * Sample example of Class - Type - III 
 */

class Sample
{
	String str;
}
 
class Class3
{
	public static void main (String[] args) 
	{
		Sample obj = new Sample();
		obj.str = "hello world";
		System.out.println("Value of class variables: " + obj.str);
	}
}