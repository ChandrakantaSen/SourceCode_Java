import java.util.*;

class ConsOverloading
{
	int a,b,sum;
	static Scanner sc = new Scanner(System.in);
	
	ConsOverloading()
	{
		a = 10;
		b = 20;
		sum = 0;
	}
	
	ConsOverloading(int x, int y)
	{
		a = x;
		b = y;
	}
	
	void addition()
	{
		sum = (a + b);
		System.out.println("Required Sum is: " + sum);
	}
	
	public static void main (String[] args) 
	{
		int p,q;
		System.out.println("Enter the values: ");
		p = sc.nextInt();
		q = sc.nextInt();
		
		ConsOverloading CObj = new ConsOverloading();
		CObj.addition();
		
		ConsOverloading CObj1 = new ConsOverloading(p,q);
		CObj1.addition();
			
	}
}