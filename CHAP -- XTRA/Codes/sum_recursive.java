import java.io.*;
public class sum_recursive
{
static int sum(int n)
{
if(n==0)
return 0;
else
return n+sum(n-1);
    }

public static void main( String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
   System.out.println("enter the number upto which the sum is to be found");
   int m=Integer.parseInt(br.readLine());
   int d=0;
   d=sum(m);
   System.out.println("the sum till  "+m+" is "+d);
}
    }