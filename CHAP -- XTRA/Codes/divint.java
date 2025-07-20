import java.io.*;
class divint
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any number : -");
a=Integer.parseInt(br.readLine());
if(a%2==0)
{
System.out.println(a+" is a even number");
    }
    else
    {
        System.out.println(a+" is a odd number");
    }
}
    }
