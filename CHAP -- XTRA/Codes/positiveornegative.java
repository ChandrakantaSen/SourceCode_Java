import java .io.*;
class positiveornegative
{
public static void main (String args[]) throws IOException
{
int a;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the a no.");
a=Integer.parseInt (br.readLine());
if (a>0)
{
System.out.println (a+" Is a +eve no. ");
    }
    else 
    {
    System.out.println (a+" Is a -eve no. ");
}
    }
}