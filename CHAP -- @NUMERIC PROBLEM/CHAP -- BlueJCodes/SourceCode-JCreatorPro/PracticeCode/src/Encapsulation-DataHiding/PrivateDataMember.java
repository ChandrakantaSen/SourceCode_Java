import java.io.*;

class Encapsulation
{
	private int x,y,z;

	InputStreamReader read = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(read);

	void getValue()throws IOException
	{
		System.out.print("Enter the vlaue of x: ");
		x = Integer.parseInt(in.readLine());

		System.out.print("Enter the vlaue of y: ");
		y = Integer.parseInt(in.readLine());
	}

	void addition()
	{
		z = (x + y);
	}

	void display()
	{
		System.out.println("Sum is: " + z);
	}
}

class PrivateDataMember
{
	public static void main (String[] args)throws IOException
	{
		Encapsulation obj = new Encapsulation();

		obj.getValue();
		obj.addition();
		obj.display();
	}
}