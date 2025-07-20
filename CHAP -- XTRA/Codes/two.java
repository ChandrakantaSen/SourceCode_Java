import java.io.*;
class two
{
public static void main(String args[])throws IOException
{
int a,b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second number : - ");
b=Integer.parseInt(br.readLine());
if(a>b)
{
System.out.println(a+" is greater than b+");
System.out.println(b+" is smaller than a+");
    }
    else
    {
        System.out.println(b+" is greater than a+");
        System.out.println(a+" is smaller than b+");
    }
}
    }