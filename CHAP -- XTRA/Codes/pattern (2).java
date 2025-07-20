class pattern
{
	public static void main (String args[])
	{
		int i,j,k;
		for(i=5;i>=1;i--)
		{
			k=i;
			for(j=1;j<=5;j++)
			{
				if(k<=5)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print("5");
				}
				k++;
			}
			System.out.println();
		}
	}
}
