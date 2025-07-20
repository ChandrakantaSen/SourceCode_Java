import java.io.*;
class multi
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
if(a%5==0)
{
System.out.println("The "+a+" is divisible by 5");
    }
else
{
System.out.println("The "+a+" is not divisible by 5");
    }
    }
}