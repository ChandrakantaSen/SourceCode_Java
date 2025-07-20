/*W.a.p to print the sum of the natural number and print the 

serise*/
class Natural
{
	int x;
	public int cal(int y)
	{
		x=y;
		int sum=0,squre=0;
		int i;
		System.out.print("The serise is : ");
		for(i=1;i<=x;i++)
		{
			squre=i*i;
			System.out.print(squre);
			sum=sum+squre;
			if(i<x)
			System.out.print("+");
		}
		return(sum);
	}
}
		
	

class NaturalNumberSerise
{
	public static void main(String args[])
	{
		int n=5;
		Natural Natural1=new Natural();
		int r1=Natural1.cal(n);
		System.out.println("= " + r1);
	}
}