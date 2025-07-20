import java.io.*;
class divfel
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int a;
System.out.println(" Enter any no. : - ");
a=Integer.parseInt(br.readLine());
System.out.println(" : - ");
if(a%2==0)
{
if(a%3==0)
{
System.out.println(a+ "is divisible by both 2 & 3");
    }
    else
    {
        System.out.println(a+ "is divisible by  2 ");
    }
}
else if(a%3==0)
{
if(a%2==0)
{
System.out.println(a+"is  divisible by 3");
    }
    else
    {
        System.out.println(a+"is divisible by 2");
    }
}
    else
    {
        System.out.println(a+"is divisible neither by 2 nor by 3");
    }
}
    }