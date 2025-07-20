import java .io.*;
class greater 
{
public static void main (String args[]) throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the 1st no.");
a=Integer.parseInt (br.readLine());
System.out.println ("Enter the 2nd no.");
b=Integer.parseInt (br.readLine());
System.out.println ("Enter the 3rd no.");
c=Integer.parseInt (br.readLine());
if ((a>b)&&(a>c))
{
System.out.println("The greater no. is" +a);
    }
    else if ((b>a)&&(b>c))
    {
        System.out.println("The greater no. is" +b);
    }
    else
    {
        System.out.println("The greater no. is" +c);
    }
}
    }