import java.io.*;
class even
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
{
System.out.println("Enter the number");
int a;
a=Integer.parseInt(br.readLine ());
if(a%2==0)
{
System.out.println(a+" is even");
    }
    else
    {
    System.out.println(a+" is odd");    
}
    }
}
    }