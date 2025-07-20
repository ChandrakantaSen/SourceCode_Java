class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("in class A: " +i);	
			if(i==2)
			{
					yield();
					System.out.print("process control not in A");
			}
		
	
		}
		System.out.print("exit from class A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=0;j<8;j++)
		{
			System.out.println("in class B: "+j);
			if(j==6)
			stop();
			
		}
		System.out.print("exit from class B");
	}
}
class  C extends Thread
{
	public void run()
	{
		for(int k =0;k<3;k++)
		{
			System.out.println("in class C: "+k);
			if(k==2)
				try
				{
					sleep(10000);
				}
			catch(Exception e)
			{
			}	
		
		}
		System.out.println("exit from class C");
	}
}
class threadprog
{
	public static void main (String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
	
		a.start();	
		b.start();
		c.start();		
	}
}