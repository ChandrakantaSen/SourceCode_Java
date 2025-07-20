import java.io.*;
class number3
{
public static void main(String args[])throws IOException
{
 int a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a number to check whether it is divisible by 2&5both or just by 2 or just by 5");
a=Integer.parseInt(br.readLine());
if((a%2==0)&&(a%5==0))
{
System.out.println(a+"is divisible by both 2&5");
    }
    else if(a%2==0)
    {
       System.out.println(a+"is divisible by only 2"); 
    }
     else if(a%5==0)
    {
         System.out.println(a+"is divisible by only 5"); 
    }
    else
    {
          System.out.println(a+"is not divisible by 2&5both or by any one");
        }
    }
}