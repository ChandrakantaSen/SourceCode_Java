import java.io.*;
class buzz   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.println("Enter a number to check whether it is a buzz number or not");
n=Integer.parseInt(br.readLine());
if((n%7==0)||(n%10==7))
{
System.out.println(n+" is a buzz number .");
    }
    else
{
System.out.println(n+" is not a buzz number .");
    }
}
    }