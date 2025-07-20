import java.io.*;
import java.lang.*;
class quardratic
{
	float a,b,c;
	void get_value(float x,float y,float z)
	{
		a=x;
		b=y;
		c=z;
	}
	public void show_roots()
	{
		float d=b*b-4*a*c;
		if(d<0)
		{
			System.out.println("The Equation of the roots are Imaginary");
		}
		else
		{
			System.out.println("The Equation of the roots are Real");
			float x=(float)Math.sqrt(d);
			float x1=(-b+x)/2*a;
			System.out.println("X1= "+x1);
			float x2=(-b-x)/2*a;
			System.out.println("X2= "+x2);
		}
	}
}
class root_equation
{
	public static void main(String args[]) throws IOException
	{
		float a,b,c;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		quardratic obj1= new quardratic();
		System.out.print("Enter value of A : ");
		a=Float.valueOf(obj.readLine()).floatValue();
		System.out.print("Enter value of B : ");
		b=Float.valueOf(obj.readLine()).floatValue();
		System.out.print("Enter value of C : ");
		c=Float.valueOf(obj.readLine()).floatValue();
		
	
		obj1.get_value(a,b,c);
		obj1.show_roots();
	}
}