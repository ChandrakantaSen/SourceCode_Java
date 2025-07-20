import java.io.*; 
class reccursion_01
{
public static int fact (int n)
{
if (n==0)
{
return 1;
    }
else
{
return n*fact(n-1);
    }
}
public static void main (String args[]) throws IOException
{
int m,d;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Please enter the number whose factorial is to be found");
m=Integer.parseInt (br.readLine());
d=fact (m);
System.out.println ("The factorial of"+m+"is"+d);
    }
}