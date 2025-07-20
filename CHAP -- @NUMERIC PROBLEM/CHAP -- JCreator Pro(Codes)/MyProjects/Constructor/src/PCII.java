import java.util.*;

class PCII
{
	int a,b,sum;
	static Scanner sc = new Scanner(System.in);
	
	PCII(int a, int b)
	{
		this.a = a;
		this.b = b;
		sum = 0;
	}
	
	void addition()
	{
		sum = (a + b);
		System.out.println("Required Sum is: " + sum);
	}
	
	public static void main (String[] args) 
	{
		int m,n;
		System.out.println("Enter the numbers: ");
		m = sc.nextInt();
		n = sc.nextInt();
			
		PCII PCobj = new PCII(m,n);
		PCobj.addition();
	}
}