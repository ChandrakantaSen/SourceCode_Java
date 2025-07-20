import java.io.*;
class divide8 
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no. to be check whether the no. is divisible by 3or5 or not");
a=Integer.parseInt(br.readLine());
if((a%3==0)||(a%5==0))
{
System.out.println(a+"is divisible by 3or5");
    }
    else
    {
System.out.println(a+"is neither divisible by 3 nor 5");
    }
}
    }