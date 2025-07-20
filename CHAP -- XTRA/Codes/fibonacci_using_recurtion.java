import java.io.*;
class fibonacci_using_recurtion
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any number");
		int n=Integer.parseInt(obj.readLine());
		int m;
		for (int i=0;i<=n;i++)
		 {
			  m=fibo(i);
			  System.out.print(" "+m);
	     }
}
static int fibo(int x)
{
 int s=1;

  if(x==0||x==1)
    return 1;
  else
 	return (fibo(x-2)+fibo(x-1));
}
}



