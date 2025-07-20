import java.io.*;
class factorial_using_recurtion
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any number");
		int n=Integer.parseInt(obj.readLine());
		int m;
		m=factorial(n);
		System.out.println("The Factorial of " +n+ " is Equal to "+m);		
	}
static int factorial(int x)
{
 int s=1;
 	 
  if(x==1)
    return (1);
  else
 	 	{  	 
  	   		s=x*factorial(x-1);
  	   		return s;
  	    }  
}
  	    
	
}


  	    
