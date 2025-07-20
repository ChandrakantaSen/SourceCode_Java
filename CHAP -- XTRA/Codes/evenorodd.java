import java .io.*;
class evenorodd
{
public static void main (String args[]) throws IOException
{
int a;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println ("Enter  a no.");
a=Integer.parseInt (br.readLine());
if (a%2==0)
{
System.out.println (a+" No. is even ");
    }
    else 
    {
        System.out.println (a+" No. is odd ");
    }
}
    }