import java .io.*;
class vote 
{
public static void main (String args[]) throws IOException
{
int a;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the age of a person");
a=Integer.parseInt (br.readLine());
if (a>=18)
{
System.out.println ("The person is eligible for vote");
    }
    else
    {
System.out.println ("The person is not eligible for vote");
    }
}
    }
