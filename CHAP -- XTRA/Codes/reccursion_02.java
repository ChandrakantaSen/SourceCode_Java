import java.io.*; 
class reccursion_02
{
public static double sum (double n)
{
if (n==0)
{
return 1;
    }
else
{
return Math.pow(n,n)+sum(n-1);
    }
}
public static void main (String args[]) throws IOException
{
int m;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Please enter the number whose factorial is to be found");
m=Integer.parseInt (br.readLine());
System.out.println ("The factorial of "+m+" is "+sum(m));
    }
}