class pattern
{
	public static void main(String args[])
	{
		int z=5;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print (" ");
			}
			for(int k=1;k<=z;k++)
			{
				System.out.print (k);
			}
			z--;
			System.out.println();
		}
	}
}
