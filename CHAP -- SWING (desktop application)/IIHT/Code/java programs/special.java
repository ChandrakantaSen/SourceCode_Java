import java.util.*;
class special1
{
	//special1();
	int read()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("enter a number: ");
		num=sc.nextInt();
		return (num);
	}
	int factorial(int x)
	{
		int i,fact=1;
		for(i=1; i<=x; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	boolean isspecial()
	{
		int m=read();
		int temp,f,mod,sum=0;
		temp=m;
		
		while(m!=0)
		{
		   mod = m%10;
		   f = factorial(mod);
		   //System.out.println("Value is: " + f);
		   sum=sum+f;
		   m=m/10;
		}
		if (sum==temp)
			return true;
		else 
			return false;
	}	
		
	void display()
	{
		if(isspecial()==true)
		{
			System.out.println("Special Number");
		}
		else
		{
			System.out.println("Not a Special Number");
		}
	}	
}

class special
{
	public static void main (String[] args)
		 {
		special1 obj=new special1();
		//obj.read();
		//obj.factorial();
		obj.display();
		}
}