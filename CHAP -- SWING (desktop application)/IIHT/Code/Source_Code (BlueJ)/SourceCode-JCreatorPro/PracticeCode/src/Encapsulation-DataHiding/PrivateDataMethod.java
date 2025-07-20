import java.io.*;

class Encapsul
{
	private int a, b, c;

	InputStreamReader read = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(read);

	private void getVal()throws IOException
	{
		System.out.print("Enter the vlaue of a: ");
		a = Integer.parseInt(in.readLine());

		System.out.print("Enter the vlaue of b: ");
		b = Integer.parseInt(in.readLine());
	}

	void multiplication()throws IOException
	{
		getVal();
		c = (a * b);
	}

	void disp()
	{
		System.out.println("Multiplication is: " + c);
	}
}

class PrivateDataMethod
{
	public static void main (String[] args)throws IOException
	{
		Encapsul enObj = new Encapsul();

		enObj.multiplication();
		enObj.disp();
	}
}