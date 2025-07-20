import java.io.*;
public class math2

{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
double b;
System.out.println("enter the number:-");
a=Integer.parseInt(br.readLine());
b=Math.pow(a,2);
System.out.println("The square of "+a+" is"+b);
}
}
