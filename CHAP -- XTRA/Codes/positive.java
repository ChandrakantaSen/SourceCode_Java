import java.io.*;
class positive
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
{
System.out.println("Enter the number");
int a;
a=Integer.parseInt(br.readLine ());
if(a>0)
{
System.out.println(a+" is positive");
    }
    else
    {
    System.out.println(a+" is negative");    
}
    }
}
    }