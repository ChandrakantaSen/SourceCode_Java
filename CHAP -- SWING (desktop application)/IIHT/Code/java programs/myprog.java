import java.util.*;
class myprog
{
 public static void main (String[] args) {
 	Scanner sc=new Scanner(System.in);
 	int i,num;
 	System.out.println("enter a number:");
 	num=sc.nextInt();
    System.out.print("enter a number to choose an operation: 1.for sum of digits 2. to count number of digits 3. factorial of a number 4.to check the number is Prime or not");

	i=sc.nextInt();
	
	switch(i)
	{
		case 1:
			int sum=0,b,c;
			while(num!=0)
			{
			b=num%10;
			sum=b+sum;
			num=num/10;
			}
			System.out.println("sum of digits: "+sum);
			break;
		case 2:
			int e,count=0;
			while(num!=0)
			{
				e=num%10;
				count++;
				num=num/10;
			}
			System.out.println("number of digits: "+count);
			break;
		case 3:
			int j,fact=1;
			for(j=num;j>0;j--)
				fact=fact*j;
				System.out.println("factorial of a number is: " +fact);
					break;
	   case 4:
	   	int r;
	   	System.out.println("enter a range:");
 	    r=sc.nextInt();
	    int x,y,count1=0,p,q,t=0,temp=0;
	    for(j=1;j<=r;j++)
	    {
	    for(x=1;x<=j;x++)
	    {
	    	if(j%x==0)
	    		count1++;
	    }
	    if(count1==2)
	    {
	    	System.out.println("num is prime: "+j);
	    	temp=j;
	   		while(j!=0)
	   		{
	   	 		p=j%10;
	   	 		t=t*10+p;
	   	 		j=j/10;	
	   		}
	   		if(t==temp)
	   		{
	   			System.out.println("num is palindrome: "+j);
	   		}
	    }
	    count1=0;
	    }   		   			
	}	
}
}