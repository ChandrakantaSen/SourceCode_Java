import java.io.*;
class br
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any number : -");
a=Integer.parseInt(br.readLine());
if(a%5==0)
{
System.out.println(a+" is divisible by 5");
    }
    else
    {
        System.out.println(a+" is not divisible by 5");
    }
}
    }
