import java.io.*;
public class numbers2
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter a number to check whether it is positive or negative or equal to 0");
a=Integer.parseInt(br.readLine());
if(a>0)
{
System.out.println(a+"is a positive number");
    }
    else if(a==0) 
    {
        System.out.println(a+"is equal to 0");
    }
    else if(a<0)
    {
      System.out.println(a+"is a negative number");
    }
}
    }