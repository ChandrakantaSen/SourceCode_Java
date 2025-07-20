import java.util.*;
class supersix
{
	public static void main(String args[])
		{
	Scanner sc=new Scanner(System.in);
	int num,temp,mod;
	System.out.print("enter a number:");
    num=sc.nextInt();
    temp=num;
    int count=0;
    while(num!=0)
    {
    	mod=num%10;
    	if(mod==6)
    	{
    		count++;
    	}
    	num=num/10;
    }
    if(count>=2)
    	System.out.println(""+temp+"is supersix number");
    else
    	System.out.println(""+temp+"is not supersix number");
}
}