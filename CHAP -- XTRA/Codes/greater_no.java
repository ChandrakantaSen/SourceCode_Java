import java.io.*;
class greater_no
{
public static void main(String args[])throws IOException
{
int a,b,c;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter two no. to check which no. is greatest");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=(a>b)?a:b;
System.out.println("The greater no. is"+c);
    }
}