import java.io.*;
class divide9 
{
public static void main(String args[])throws IOException
{
int a; 
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no. to be check whether the no. is divisible by 8or10 or not");
a=Integer.parseInt(br.readLine());
if((a%8==0)||(a%10==0))
{
System.out.println(a+"is divisible by 8or10");
    }
    else
    {
System.out.println(a+"is neither divisible by 8 nor 10");
    }
}
    }