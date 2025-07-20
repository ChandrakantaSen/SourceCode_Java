import java.io.*;
class iftesting
{
public static void main(String[]args)throws IOException
{
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter one number");
a=Integer.parseInt(br.readLine());
if(a%2==0)
System.out.println("The number is even"); 
else
System.out.println("the number is odd");
    
    }
}