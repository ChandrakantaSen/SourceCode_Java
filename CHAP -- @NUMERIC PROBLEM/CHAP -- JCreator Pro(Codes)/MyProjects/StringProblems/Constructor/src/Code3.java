import java.util.*;
class Code3 
{	
	int x;
	Code3(int a)
	{
		x = a;
	}
	public static void main(String[] args) 
	{
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		p = sc.nextInt();
		
		Code3 obj = new Code3(p);
		System.out.println("The value is: " + obj.x);
	}	
}