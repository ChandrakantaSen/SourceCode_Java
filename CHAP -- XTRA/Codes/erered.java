import java.io.*;
class erered  
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any number : -");
a=Integer.parseInt(br.readLine());
if(a%3==0)
{
System.out.println(a+" is divisible by 3");
    }
    else
    {
        System.out.println(a+" is not divisible by 3");
    }
}
    }
