/*W.a.p to print the perfect numbers e.g=6=2+3+1=6(i.e the sum of
the factors =the number)*/
class serise
{
	int n;
	public int cal(int y)
	{
		n=y;
		int i,j,sum=1,r=0,res=0;
		System.out.print("The perfect number serise upto " +  n + " : " );
		System.out.print(" 1 ,");
		for(i=1;i<=n;i++)
		{
			for(j=2;j<i;j++)
			{
				r=i%j;
				if(r==0)
				{
					res=i/j;
					sum=j+sum;
				}
            if(j==i-1)
            if(sum==i)
		System.out.print(sum+ " ,");
             }		
		sum=1;
		}
	return(0);
	}
	
}

class Perfect
{
	public static void main(String args[])
	{
		int x=1000;
		serise serise1=new serise();
		int r1=serise1.cal(x);
	}
}