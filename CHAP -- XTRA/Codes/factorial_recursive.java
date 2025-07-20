import java.io.*;
class factorial_recursive
{
static int fact(int n)
{
if(n==0)
return 1;
else 
return (n*(fact(n-1)));
    }
    public static void main( String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
   System.out.println("enter the number whose factorial is to be found");
   int m=Integer.parseInt(br.readLine());
   int d=0;
   d=fact(m);
   System.out.println("the factorial of "+m+" is "+d);
}
    }
