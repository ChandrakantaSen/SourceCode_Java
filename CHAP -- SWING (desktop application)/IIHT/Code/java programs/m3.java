import java.util.*;
class m4
{
	int digits(int n)
	{
		int temp,c=0;
		temp = n;
		while(temp!=0)
		{
			temp=temp/10;
			c++;	
		}
		//System.out.println(c);
		return (c);
	}
	int reverse(int n)
	{
		int t,temp,div,mod,c,sum=0;
		temp = n;
		c=digits(n);
		while(temp!=0)
		{
			mod= temp%10;
			sum=sum+(int)Math.pow(10,c-1)*mod;
			c--;
			temp=temp/10;		
		}
		//System.out.println(sum);
		return(sum);
		
	}
	void unique(int n)
	{
			/*int num;
			*/
			int a[] = new int[10];
			int rev,mod,d=0,i;
			rev=reverse(n);		//345
			int sub=(n-rev);	//198
			while(sub!=0)
			{
				mod=sub%10;		//8
				for(i=0;i<=9;i++,d=0)
				{
					if(mod==i)
					{
						d++;
						a[i]=a[i] + d;
					}
			//	System.out.println(+mod+"is present: "+d +"times");
				}
			    sub=sub/10;	
			}
			for(i= 0;i<a.length;i++)
			{
			    if(a[i]>0)
			    {
			    	System.out.println(""+i+" is present "+a[i]+" times");
			    }
			}
			for(i=0;i<a.length;)
			{
					if(a[i]>=2)
					{
							System.out.println("the number is not unique");
							break;
					}
					else
						i++;
						
			}
		
		
	}
}
class m3
{
	public static  void main(String args[])
	{
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		input=sc.nextInt(); 
		m4 ob = new m4();
		ob.unique(input);
	}
}
		

	