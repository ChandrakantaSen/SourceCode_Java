/*W.a.p to obtain the multiplication table upto agiven limit*/

class show
{
	int n;
	public int cal(int y)
	{
		n=y;
		int i=-1,j=0,mul,k,c=1,p=0;
		 System.out.println("The multiplication table for the limit : " +n+" is");
		for(i=-1;i<=n;i++)
		{
           if (i<=0)
		{
				if(i==-1)
				{
					for(k=1;k<=n;k++)
                    {if(k==1)
                     System.out.print("  | "+ k );
                     else
                    System.out.print(" "+k);}
                    
				}
				else
				{
					for(k=0;k<=n+6;k++)
					System.out.print("-");
				}
			}
		
					for(j=0;j<=n;j++)
			{
				
		        	
		        	if(i>0)
		        	{
		        		if(j>0)
		           	     {
		        	        mul=i*j;
		        	        System.out.print(" "+mul);
		                  }     
		              }
			      if(j==0)
		         {
		          	p=1;
		          	mul=p*i;
		         if(mul>0)
		         System.out.print(" "+mul+"|");
		        }
			}
			    
			    System.out.println();
			  
		        }	
		   return(0);
	} 
}		        	
				
class multiplicationtable
{
	public static void main(String args[])
	{
		int x=4;
		show obj1=new show();
		int r1=obj1.cal(x);
	}
}