import java.util.*;
class Code4 
{	
	int x;
	Code4()
	{
		x = 999;
	}
	Code4(int a)
	{
		x = a;
	}
	public static void main(String[] args) 
	{
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		p = sc.nextInt();
		
		Code4 obj = new Code4(p);
		System.out.println("The value is: " + obj.x);
	}	
}