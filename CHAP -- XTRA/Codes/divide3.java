import java.io.*;
class divide3 
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no. to be check whether the no. is divisible by 3&5 both or not");
a=Integer.parseInt(br.readLine());
if((a%3==0)&&(a%5==0))
{
System.out.println(a+"is divisible by both 3&5");
    }
    else
    {
System.out.println(a+"is not divisible by both 3&5");
    }
}
    }