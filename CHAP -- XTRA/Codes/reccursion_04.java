import java.io.*; 
class reccursion_04
{
public static int dec (int n)
{
if (n<2)
{
return n;
    }
else
{
return ((n%2)+(10*dec(n/2)));
    }
}
public static void main (String args[]) throws IOException
{
int m;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Please enter the number whose binary are to be found");
m=Integer.parseInt (br.readLine());
System.out.println ("The Binary of "+m+" is "+dec(m));
    }
}