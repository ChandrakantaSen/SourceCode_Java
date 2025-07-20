import java.io.*;
class smallest
{
public static void main(String args[])throws IOException
{
int a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter two no. to check which no. is smallest");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
if(a<b)
{
System.out.println(a+"is smallest");
    }
else
    {
        System.out.println(b+"is smallest");
    }
}
    }