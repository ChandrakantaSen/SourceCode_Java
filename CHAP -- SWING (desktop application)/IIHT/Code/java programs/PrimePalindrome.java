import java.util.*;

class PrimePalindrome
{
	public static void main (String[] args) 
	{
		int r,j;
		int x,y,count1=0,p,q,t=0,temp;
		
		Scanner sc = new Scanner(System.in);
	   	System.out.println("enter a range:");
 	    r=sc.nextInt();
	    
	    
	    for(j=1;j<=r;j++)
	    {
	    	for(x=1;x<=j;x++)
	    	{
	    		if(j%x==0)
	    			count1++;
	    	}
	    	if(count1==2)
	    	{
	    		//System.out.print(" "+j);
		    	temp=j;
		    	//System.out.print(temp + " ");
		   		while(temp != 0)
		   		{
		   	 		p = temp % 10;
		   	 		t = t * 10 + p;
		   	 		temp = temp / 10;	
		   		}	
		  
		   		//System.out.print(t + " ");
		   		if(t == j)
		   		{
		   			//System.out.print(" "+j);
		   			 	int e,count=0,temp2=0;
		   				temp2=t;
						while(t!=0)
							{
							t=t/10;
							count++;
							}
							if(count>1)
							System.out.print(" "+j);
		   		}
	    	}
	   	 	count1=0;	
	   	 	t = 0;	
		}
	}   
}		   	