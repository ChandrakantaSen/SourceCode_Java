import java.io.*;
class divide11 
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no. to be check whether the no. is divisible by 10or20 or not");
a=Integer.parseInt(br.readLine());
if((a%10==0)||(a%20==0))
{
System.out.println(a+"is divisible by 10or20");
    }
    else
    {
System.out.println(a+"is neither divisible by 10 nor 20");
    }
}
    }