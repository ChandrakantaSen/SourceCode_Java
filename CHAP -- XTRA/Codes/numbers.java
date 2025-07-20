import java.io.*;
public class numbers 
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter a number to check whether it is positive or negative");
a=Integer.parseInt(br.readLine());
if(a>0)
{
System.out.println(a+"is a positive number");
    }
    else
    {
        System.out.println(a+"is a negative number");
    }
}
    }