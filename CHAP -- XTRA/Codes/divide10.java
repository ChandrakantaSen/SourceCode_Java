import java.io.*; 
class divide10
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no. to be check whether the no. is divisible by 7or8 or not");
a=Integer.parseInt(br.readLine());
if((a%7==0)||(a%8==0))
{
System.out.println(a+"is divisible by 7or8");
    }
    else
    {
System.out.println(a+"is neither divisible by 7 nor 8");
    }
}
    }