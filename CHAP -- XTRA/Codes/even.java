import java.io.*;
class even    
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number to check wheather the number is even or odd : -");
a=Integer.parseInt(br.readLine());
if(a%2==0)
{
System.out.println(a+" is an even number .");
    }
    else
{
System.out.println(a+" is an odd number .");
    }
}
    }