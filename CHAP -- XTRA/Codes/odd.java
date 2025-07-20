import java.io.*;
class odd
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
{
System.out.println("Enter the number");
int a;
a=Integer.parseInt(br.readLine ());
if(a%3==0)
{
System.out.println(a+" is divisible by 3");
    }
    else
    {
    System.out.println(a+" is not divisible by 3");    
}
    }
}
    }