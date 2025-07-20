class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("in class A: " +i);	
		
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
		
	//	c.setPriority(Thread.MAX_PRIORITY);
	//	b.setPriority(a.getPriority()+1);
	//	a.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("name of thread A: "+a.getName());
		
		System.out.println("start A: ");
		
		
		a.start();
		a.setName("Aditi");
		System.out.println("name of thread A: "+a.getName());
		
		
		System.out.println("start B: ");	
		b.start();
		System.out.println("start C: ");
		c.start();		
	}
}