import java.io.*;
class TFS
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any number : - ");
a=Integer.parseInt(br.readLine());
if((a%5==0)||(a%7==0))
{
System.out.println(a+" is divisible by 5 or 7");
    }
    else
    {
        System.out.println(a+" is divisible neither by 5 nor by 7");
    }
}
    }