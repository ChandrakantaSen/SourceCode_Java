import java.io.*;
class divide6
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no. to be check whether the no. is divisible by 10&20 both or not");
a=Integer.parseInt(br.readLine());
if((a%10==0)&&(a%20==0))
{
System.out.println(a+"is divisible by both 10&20");
    }
    else
    {
System.out.println(a+"is not divisible by both 10&20");
    }
}
    }