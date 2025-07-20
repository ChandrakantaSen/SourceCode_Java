import java.io.*;
class div
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
if(a%3==0)
{
System.out.println("The "+a+" is divisible by 3");
    }
else
{
System.out.println("The "+a+" is not divisible by 3");
    }
    }
}